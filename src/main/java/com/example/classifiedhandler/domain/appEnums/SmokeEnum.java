package com.example.classifiedhandler.domain.appEnums;

public enum SmokeEnum {

    SMOKING_IS_OK("Smoking is Ok"),
    SMOKE_OUTSIDE_ONLY("Smoke outside only");

    private final String label;

    SmokeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
