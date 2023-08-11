package com.example.classifiedhandler.domain.appEnums;

public enum TypePropertyEnum {
    SINGLE_FAMILY_HOME("Single family home"),
    APARTMENT("Apartment"),
    CONDO("Condo"),
    TOWNHOME("Townhome"),
    PARKING_GARAGE("Parking Garage");

    private final String label;

    TypePropertyEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
