package com.mobile.foodtrucks.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class NearRange implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double maxLongitude;
    private Double minLongitude;
    private Double maxLatitude;
    private Double minLatitude;
}
