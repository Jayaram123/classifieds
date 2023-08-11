package com.example.classifiedhandler.domain.appEnums;

public enum FurnishedEnum {

    UNFURNISHED("Un Furnished"),
    FURNISHED_WITH_BED("Furnished with Bed"),
    SEMI_FURNISHED("Semi Furnished"),
    FULLY_FURNISHED("Fully Furnished");

    private final String label;

    FurnishedEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

