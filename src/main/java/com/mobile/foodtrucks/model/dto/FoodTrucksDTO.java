package com.mobile.foodtrucks.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class FoodTrucksDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String applicant;

    private String locationDescription;

    private String foodItems;

    private String address;

}
