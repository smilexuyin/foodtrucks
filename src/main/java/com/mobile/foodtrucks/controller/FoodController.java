package com.mobile.foodtrucks.controller;

import com.mobile.foodtrucks.entity.FoodTrucksEntity;
import com.mobile.foodtrucks.service.FoodtrucksService;
import com.mobile.foodtrucks.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * web api
 */
@RestController
@RequestMapping(value="/foodtruck")
public class FoodController {

    @Autowired
    private FoodtrucksService foodtrucksService;

    /**
     * Query food truck information for specified food
     * @param foodItem
     * @return
     */
    @GetMapping(value = "/list/{foodItem}")
    public Result<List<String>> getFoodtrucksInfo(@PathVariable String foodItem) {
        return Result.success(foodtrucksService.getFoodtrucksInfo(foodItem));
    }

    /**
     * Search for food trucks near the given location's latitude and longitude
     * @param longitude
     * @param latitude
     * @param distance
     * @return
     */
    @GetMapping(value = "/nearlist/{longitude}/{latitude}/{distance}")
    public Result<List<String>> getNearFoodtrucks(@PathVariable Double longitude,@PathVariable Double latitude,@PathVariable Double distance) {
        return Result.success(foodtrucksService.getNearFoodrucks(longitude,latitude,distance));
    }

    /**
     * Query details based on truck name
     * @param applicant
     * @return
     */
    @GetMapping(value = "/details/{applicant}")
    public Result<List<FoodTrucksEntity>> getDetailByApplicant(@PathVariable String applicant) {
        return Result.success(foodtrucksService.getDetailByApplicant(applicant));
    }
}
