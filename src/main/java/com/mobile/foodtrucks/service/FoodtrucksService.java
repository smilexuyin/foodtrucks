package com.mobile.foodtrucks.service;

import com.mobile.foodtrucks.model.vo.FoodTrucksVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Food truck services
 */
@Service
public interface FoodtrucksService {

    /**
     * Query food truck information for specified food
     * @param foodItem
     * @return
     */
    List<FoodTrucksVO> getFoodtrucksInfo(String foodItem);

    /**
     * Search for food trucks near the given location's latitude and longitude
     * @param longitude
     * @param latitude
     * @param distance
     * @return
     */
    List<FoodTrucksVO> getNearFoodrucks(Double longitude,Double latitude,Double distance);

    /**
     * Query details based on truck name
     * @param applicant
     * @return
     */
    List<FoodTrucksVO> getDetailByApplicant(String applicant);

}

