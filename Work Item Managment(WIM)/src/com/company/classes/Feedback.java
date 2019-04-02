package com.company.classes;

import com.company.common.Status;
import com.company.models.contracts.FeedbackInt;

import java.util.ArrayList;
import java.util.List;

public class Feedback extends WorkItems implements FeedbackInt {
    private double rating;

    public Feedback(int ID, String title, String description, Status status, List<String> comments, List<String> history, double rating) {
        super(ID, title, description, status, comments, history);
        setRating(rating);
    }

    @Override
    public double getRating() {
        return rating;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public List<Status> getPossibleStatus() {
        List<Status> list=new ArrayList<>();
        list.add(Status.NEW);
        list.add(Status.UNSCHEDULED);
        list.add(Status.SCHEDULED);
        list.add(Status.DONE);
        return list;
    }

    @Override
    public String errorStatusMassage() {
        return "Feedback can be only NEW,UNSCHEDULED,SCHEDULED,DONE";
    }
}

