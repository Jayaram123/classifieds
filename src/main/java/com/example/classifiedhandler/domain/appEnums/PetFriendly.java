package com.example.classifiedhandler.domain.appEnums;

public enum PetFriendly {
    NO_PETS("No Pets"),
    ONLY_DOGS("Only Dogs"),
    ONLY_CATS("Only Cats"),
    ANY_PET_IS_OK("Any Pet is Ok");

    private final String label;

    PetFriendly(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
