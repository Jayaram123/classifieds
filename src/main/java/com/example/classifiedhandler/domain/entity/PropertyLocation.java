package com.example.classifiedhandler.domain.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.PrimitiveIterator;

@Data
@Embeddable
public class PropertyLocation {

    private String location;
    private String zip;
}
