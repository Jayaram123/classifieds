package com.example.classifiedhandler.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class BillingDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String confirmEmail;
    private String address;
    private String zip;
    private String city;
    private  String state;
    private String country;
}
