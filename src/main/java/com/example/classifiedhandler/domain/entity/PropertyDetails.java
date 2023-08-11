package com.example.classifiedhandler.domain.entity;

import com.example.classifiedhandler.domain.appEnums.Gender;
import com.example.classifiedhandler.domain.appEnums.PackageType;
import com.example.classifiedhandler.domain.appEnums.PriceMode;
import com.example.classifiedhandler.domain.appEnums.TypePropertyEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Data
@Embeddable
public class PropertyDetails {

    private TypePropertyEnum stayOrLeaseType;
    private LocalDate availableFrom;
    private LocalDate availableTo;
    private int accommodates;
    private boolean attachedBath;
    private Gender preferredGender;
    private BigDecimal expectedRent;
    private PriceMode priceMode;

    private BigDecimal deposit;

    @Embedded
    private OtherDetails otherDetails;

    @ElementCollection
    private List<String> addPhotos;
    @ElementCollection
    private List<byte[]> addVideos;

    private PostOwnerDetails contactDetails;

    private PackageType typePackage;
    private String couponCode;
    private BillingDetails billingDetails;


}
