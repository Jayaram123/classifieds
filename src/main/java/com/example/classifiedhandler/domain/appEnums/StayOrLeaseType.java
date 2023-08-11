package com.example.classifiedhandler.domain.appEnums;

public enum StayOrLeaseType {
    LONG_TERM("Long term (6+ months)"),
    SHORT_TERM("Short term"),
    BOTH("Both");

    private final String label;

    StayOrLeaseType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
