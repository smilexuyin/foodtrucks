package com.mobile.foodtrucks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodTrucksEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String applicant;

    private String locationDescription;

    private String foodItems;

    private String address;

    private String facilityType;

    private String permit;

    private String status;

    private String schedule;
}
