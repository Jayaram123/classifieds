package com.example.classifiedhandler.domain.appEnums;

public enum PriceMode {

    PER_MONTH("Per Month"),
    PER_NIGHT("Per Night"),
    PER_DAY("Per Day"),
    PER_WEEK("Per Week");

    private final String label;

    PriceMode(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
