package com.company.common;

public enum Priority {
    HIGH,
    MEDIUM,
    LOW;

    public String toString() {
        switch (this) {
            case HIGH:
                return "High";
            case MEDIUM:
                return "Medium";
            case LOW:
                return "Low";
            default:
                throw new IllegalArgumentException();


        }
    }
}
