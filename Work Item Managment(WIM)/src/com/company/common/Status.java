package com.company.common;

public enum Status {
    ACTIVE,
    FIXED,
    NOTDONE,
    INPROGRESS,
    DONE,
    NEW,
    UNSCHEDULED,
    SCHEDULED;

    public String toString() {
        switch (this) {
            case ACTIVE:
                return "Active";
            case FIXED:
                return "Fixed";
            case NOTDONE:
                return "Not done";
            case INPROGRESS:
                return "In progress";
            case DONE:
                return "Done";
            case NEW:
                return "New";
            case UNSCHEDULED:
                return "Unscheduled";
            case SCHEDULED:
                return "Scheduled";
            default:
                throw new IllegalArgumentException();


        }
    }
}

