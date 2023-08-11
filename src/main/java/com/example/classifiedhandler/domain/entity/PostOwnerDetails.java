package com.example.classifiedhandler.domain.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Embeddable
public class PostOwnerDetails {

    @Id
    private String id;

    private String contactName;
    private String businessName;
    private String businessCity;
    private String businessAddress;
    private String email;
    private PhoneNumber phoneNumber;

}
