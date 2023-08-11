package com.example.classifiedhandler.domain.appEnums;

public enum PackageType {

    PRIMIUM_PLUS("Primium+"),
    PRIMIUM("Primium"),
    STANDARD("Standard");
    private final String label;

    PackageType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
