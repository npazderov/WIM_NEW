package com.company.common;

public enum Size {
    LARGE,
    MEDIUM,
    SMALL;
    public String toString() {
        switch (this) {
            case LARGE:
                return "Large";
            case MEDIUM:
                return "Medium";
            case SMALL:
                return "Small";
            default:
                throw new IllegalArgumentException();


        }
    }
}
