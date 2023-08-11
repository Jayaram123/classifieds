package com.example.classifiedhandler.domain.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PostCreated {

    private String postId;
    private String title;
    private String description;
    private double price;
    private String category;
    private String contactInformation;
    private String listingId;
    private String status;
    private LocalDateTime postingDateTime;
    private List<byte[]> images;

}
