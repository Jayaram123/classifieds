package com.example.classifiedhandler.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class UserPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String postId;
    private String userId;
    private String userName;
    private LocalDateTime datePosted;
   @Embedded
    private PropertyDetails propertyDetails;

}
