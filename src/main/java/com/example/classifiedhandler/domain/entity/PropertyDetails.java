package com.example.classifiedhandler.domain.entity;

import com.example.classifiedhandler.domain.appEnums.*;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Data
@Embeddable
public class PropertyDetails {

    private String stayOrLeaseType;//condo/apartment/own-hourse
    private LocalDate availableFrom;
    private LocalDate availableTo;

    private String zip;
    private int accommodates;
    private boolean attachedBath;
    private Gender preferredGender;
    private BigDecimal expectedRent;
    private Boolean isPriceNegotiable;
    private PriceMode priceMode;

    private BigDecimal deposit;

    private Integer propertySize;

    private String roomType;//furshned/unfurnished

    @ElementCollection
    private List<String> amenities;
    private String vegOrNon_VegOrBoth;
    private SmokeEnum smoke;
    private String petFriendly;//dog allowed/not-allowed

    @ElementCollection
    private List<String> addPhotos;
    @ElementCollection
    private List<byte[]> addVideos;
    private String id;

    private String contactName;
    private String businessName;
    private String businessCity;
    private String businessAddress;
    private String email;
    private PhoneNumber phoneNumber;

    private PackageType typePackage;
    private String couponCode;
    private BillingDetails billingDetails;
    private String firstName;
    private String lastName;
    private String emailContact;
    private String confirmEmail;
    private String address;
    private String zipContact;
    private String city;
    private  String state;
    private String country;


}
