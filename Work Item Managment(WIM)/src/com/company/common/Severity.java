package com.company.common;

public enum Severity {
    CRITICAL,
    MAJOR,
    MINOR;

    public String toString() {
        switch (this) {
            case CRITICAL:
                return "Critical";
            case MAJOR:
                return "Major";
            case MINOR:
                return "Minor";
            default:
                throw new IllegalArgumentException();


        }
    }
}
