package com.mobile.foodtrucks.service;

import com.mobile.foodtrucks.entity.FoodTrucksEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodtrucksService {

    /**
     * Query food truck information for specified food
     * @param foodItem
     * @return
     */
    List<String> getFoodtrucksInfo(String foodItem);

    /**
     * Search for food trucks near the given location's latitude and longitude
     * @param longitude
     * @param latitude
     * @param distance
     * @return
     */
    List<String> getNearFoodrucks(Double longitude,Double latitude,Double distance);

    /**
     * Query details based on truck name
     * @param applicant
     * @return
     */
    List<FoodTrucksEntity> getDetailByApplicant(String applicant);

}

