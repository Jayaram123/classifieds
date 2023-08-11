package com.example.classifiedhandler.domain.appEnums;

public enum NeedTypeEnu_Home {
    I_HAVE_PROPERTY_TO_RENT("I have a property to rent"),
    I_HAVE_ROOM_TO_RENT("I have a room to rent"),
    I_HAVE_COMMERCIAL_SPACE_TO_RENT("I have a commercial space to rent"),
    I_HAVE_SHORT_STAY_ACCOMMODATION("I have a short stay accommodation"),

    I_NEED_PROPERTY_TO_RENT("I need a property to rent"),
    I_NEED_ROOM_TO_RENT("I need a room to rent"),
    I_NEED_COMMERCIAL_SPACE_TO_RENT("I need a commercial space to rent"),
    I_NEED_SHORT_STAY_ACCOMMODATION("I need a short stay accommodation");

    private final String label;

    NeedTypeEnu_Home(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
