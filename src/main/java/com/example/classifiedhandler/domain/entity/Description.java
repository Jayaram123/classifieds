package com.example.classifiedhandler.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Description {

    private String title;
    private String description;
}
