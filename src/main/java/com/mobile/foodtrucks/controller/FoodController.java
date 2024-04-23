package com.mobile.foodtrucks.controller;

import com.mobile.foodtrucks.service.FoodtrucksService;
import com.mobile.foodtrucks.util.Result;
import com.mobile.foodtrucks.model.vo.FoodTrucksVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Food trucks API
 */
@Tag(name = "Food trucks API")
@RestController
@RequestMapping(value="/foodtruck")
public class FoodController {

    @Autowired
    private FoodtrucksService foodtrucksService;

    /**
     * Query food truck information for specified food
     * This API can obtain the names of all corn roll trucks
     * @param foodItem
     * @return
     */
    @GetMapping(value = "/list/{foodItem}")
    @Operation(summary = "Query food truck information for specified food", description = " This API can obtain the names of all corn roll trucks ")
    public Result<List<FoodTrucksVO>> getFoodtrucksInfo(@PathVariable String foodItem) {
        return Result.success(foodtrucksService.getFoodtrucksInfo(foodItem));
    }

    /**
     * Search for food trucks near the given location's latitude and longitude
     * This API can obtain food trucks near a given location
     * @param longitude
     * @param latitude
     * @param distance Unit: Kilometers
     * @return
     */
    @GetMapping(value = "/nearlist/{longitude}/{latitude}/{distance}")
    @Operation(summary = "Search for food trucks near the given location's latitude and longitude", description = " This API can obtain food trucks near a given location ")
    public Result<List<FoodTrucksVO>> getNearFoodtrucks(@PathVariable Double longitude, @PathVariable Double latitude, @PathVariable Double distance) {
        return Result.success(foodtrucksService.getNearFoodrucks(longitude,latitude,distance));
    }

    /**
     * Query details based on truck name
     * @param applicant
     * @return
     */
    @GetMapping(value = "/details/{applicant}")
    @Operation(summary = "Query details based on truck name", description = " Query details based on truck name ")
    public Result<List<FoodTrucksVO>> getDetailByApplicant(@PathVariable String applicant) {
        return Result.success(foodtrucksService.getDetailByApplicant(applicant));
    }
}
