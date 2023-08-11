package com.example.classifiedhandler.domain.entity;

import com.example.classifiedhandler.domain.appEnums.FurnishedEnum;
import com.example.classifiedhandler.domain.appEnums.PetFriendly;
import com.example.classifiedhandler.domain.appEnums.SmokeEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Embeddable
public class OtherDetails {
   private FurnishedEnum  detailsFurnished;

   @ElementCollection
   private List<String> amenities;
   private String vegOrNon_VegOrBoth;
   private SmokeEnum smoke;
   private PetFriendly petFriendly;


}
