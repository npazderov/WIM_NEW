package com.company.classes;

import com.company.models.contracts.BoardMemberBaseInt;

import java.util.ArrayList;
import java.util.List;

public class BoardMemberBase  implements BoardMemberBaseInt {
    private static final int MAX_NAME_LENGTH = 15;
    private static final int MIN_NAME_LENGTH = 5;
    private String name;
    private List<WorkItems> workItemsList;
    private String activityHistory;

    public BoardMemberBase(String name, List<WorkItems> workItemsList, String activityHistory) {
        setName(name);
        setWorkItemsList(workItemsList);
        setActivityHistory(activityHistory);
    }
    //getters and setters
    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        validateStringField(name,getMinNameLength(),getMaxNameLength());
        this.name=name;
    }

    @Override
    public List<WorkItems> getWorkItemsList() {
        return new ArrayList<>(workItemsList);
    }

    private void setWorkItemsList(List<WorkItems> workItemsList) {
        this.workItemsList = workItemsList;
    }

    @Override
    public String getActivityHistory() {
        return activityHistory;
    }

    private void setActivityHistory(String activityHistory) {
        this.activityHistory = activityHistory;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //getters for the static fields

    protected int getMinNameLength(){
        return MIN_NAME_LENGTH;
    }
    protected int getMaxNameLength(){
        return MAX_NAME_LENGTH;
    }

    //validations
    private void validateStringField(String field, int fieldMinLength, int fieldMaxLength) {
        if (field == null) {
            throw new IllegalArgumentException("Invalid");
        }
        if (field.length() < fieldMinLength || field.length() > fieldMaxLength) {
            throw new IllegalArgumentException("Invalid");
        }
    }



}
