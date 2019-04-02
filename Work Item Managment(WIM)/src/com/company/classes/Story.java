package com.company.classes;

import com.company.common.Priority;
import com.company.common.Severity;
import com.company.common.Size;
import com.company.common.Status;
import com.company.models.contracts.StoryInt;

import java.util.ArrayList;
import java.util.List;


public class Story extends WorkItems implements StoryInt {
    private Size size;
    private Priority priority;
    private Severity severity;
    private Member assignee;

    public Story(int ID, String title, String description, Status status, List<String> comments, List<String> history, Size size, Priority priority, Severity severity, Member assignee) {
        super(ID, title, description, status, comments, history);
        setSize(size);
        setPriority(priority);
        setSeverity(severity);
        setAssignee(assignee);
    }

    @Override
    public Size getSize() {
        return size;
    }

    private void setSize(Size size) {
        if (size != Size.LARGE && size != Size.MEDIUM && size != Size.SMALL) {
            throw new IllegalArgumentException("Not a declared enum");
        }
        this.size = size;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }

    private void setPriority(Priority priority) {
        priority_Validation(priority);
        this.priority = priority;
    }

    @Override
    public Severity getSeverity() {

        return severity;
    }

    private void setSeverity(Severity severity) {
        severity_Validation(severity);
        this.severity = severity;
    }

    @Override
    public Member getAssignee() {
        return assignee;
    }

    private void setAssignee(Member assignee) {
        this.assignee = assignee;
    }

    @Override
    public List<Status> getPossibleStatus() {
        List<Status> list=new ArrayList<>();
        list.add(Status.NOTDONE);
        list.add(Status.INPROGRESS);
        list.add(Status.DONE);
        return list;
    }

    @Override
    public String errorStatusMassage() {
        return "Story can be only NOT DONE, IN PROGRESS, OR DONE!";
    }
}
