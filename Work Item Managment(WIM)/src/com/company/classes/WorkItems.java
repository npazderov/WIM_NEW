package com.company.classes;

import com.company.common.Priority;
import com.company.common.Severity;
import com.company.common.Status;
import com.company.models.contracts.WorkItemsInt;

import java.util.ArrayList;
import java.util.List;

public abstract class WorkItems implements WorkItemsInt {
    private final static int MIN_LENGTH = 10;
    private final static int MAX_TITLE_LENGTH = 50;
    private final static int MAX_DESC_LENGTH = 500;
    protected static final String LIST_CANNOT_BE_NULL = "List cannot be null";
    private static final String NOT_A_DECLARED_ENUM = "Not a declared enum";
    private int ID;
    private String title;
    private String description;
    private Status status;
    private List<String> comments;
    private List<String> history;

    public WorkItems(int ID, String title, String description,Status status, List<String> comments, List<String> history) {
        setID(ID);
        setTitle(title);
        setDescription(description);
        setStatus(status);
        setComments(comments);
        setHistory(history);
    }

    @Override
    public int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        validateStringField(title, getMinLength(), getMaxTitleLength());
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        validateStringField(description, getMinLength(), getMaxDescLength());
        this.description = description;
    }

    @Override
    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    private void setComments(List<String> comments) {
        if (comments == null) {
            throw new IllegalArgumentException(LIST_CANNOT_BE_NULL);
        }
        this.comments = comments;
    }

    @Override
    public List<String> getHistory() {
        return new ArrayList<>(history);
    }

    private void setHistory(List<String> history) {
        if (history == null) {
            throw new IllegalArgumentException(LIST_CANNOT_BE_NULL);
        }
        this.history = history;
    }
    //status impl
    public abstract List<Status> getPossibleStatus();
    public abstract String errorStatusMassage();

    @Override
    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status)
    {
        if(!getPossibleStatus().contains(status)){
            throw new IllegalArgumentException(errorStatusMassage());
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    private static int getMinLength() {
        return MIN_LENGTH;
    } //not sure if redundant on not

    private static int getMaxTitleLength() {
        return MAX_TITLE_LENGTH;
    }

    private static int getMaxDescLength() {
        return MAX_DESC_LENGTH;
    }

    void priority_Validation(Priority priority) {
        if (priority != Priority.LOW && priority != Priority.MEDIUM && priority != Priority.HIGH) {
            throw new IllegalArgumentException(NOT_A_DECLARED_ENUM);
        }
    }

    void severity_Validation(Severity severity) {
        if (severity != Severity.MINOR && severity != Severity.MAJOR && severity != Severity.CRITICAL) {
            throw new IllegalArgumentException(NOT_A_DECLARED_ENUM);
        }
    }

    private void validateStringField(String field, int fieldMinLength, int fieldMaxLength) {
        if (field == null) {
            throw new IllegalArgumentException("Invalid");
        }
        if (field.length() < fieldMinLength || field.length() > fieldMaxLength) {
            throw new IllegalArgumentException("Invalid");
        }
    }
}
