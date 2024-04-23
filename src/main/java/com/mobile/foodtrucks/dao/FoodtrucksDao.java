package com.mobile.foodtrucks.dao;

import com.mobile.foodtrucks.entity.FoodTrucksEntity;
import com.mobile.foodtrucks.util.NearRange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodtrucksDao {

    List<FoodTrucksEntity> findByApplicant(String applicant);

    List<String> findByFoodInfo(String foodItem);

    List<String>findNearRange(NearRange nearRange);
}
