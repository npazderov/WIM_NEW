package com.company.classes;

import com.company.common.Priority;
import com.company.common.Severity;
import com.company.common.Status;
import com.company.models.contracts.BugInt;

import java.util.ArrayList;
import java.util.List;

public class Bug extends WorkItems implements BugInt {

    private List<String> stepsToReproduce;
    private Priority priority;
    private Severity severity;
    private Member assignee;

    public Bug(int ID, String title, String description, Status status, List<String> comments, List<String> history, List<String> stepsToReproduce, Priority priority, Severity severity, Member assignee) {
        super(ID, title, description, status, comments, history);
        setStepsToReproduce(stepsToReproduce);
        setPriority(priority);
        setSeverity(severity);
        setAssignee(assignee);
    }

    @Override
    public List<String> getStepsToReproduce() {
        return new ArrayList<>(stepsToReproduce);
    }

    private void setStepsToReproduce(List<String> stepsToReproduce) {
        if(stepsToReproduce==null){
            throw new IllegalArgumentException(LIST_CANNOT_BE_NULL);
        }
        this.stepsToReproduce = stepsToReproduce;
    }
    @Override
    public Priority getPriority() {
        return priority;
    }

    private void setPriority(Priority priority) {
      priority_Validation(priority);
      this.priority=priority;
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
        list.add(Status.ACTIVE);
        list.add(Status.FIXED);
        return list;
    }

    @Override
    public String errorStatusMassage() {
        return "Bug can be only ACTIVE or FIXED!";
    }
}

