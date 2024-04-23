package com.mobile.foodtrucks.service.impl;

import com.mobile.foodtrucks.dao.FoodtrucksDao;
import com.mobile.foodtrucks.entity.FoodTrucksEntity;
import com.mobile.foodtrucks.service.FoodtrucksService;
import com.mobile.foodtrucks.util.LocationUtils;
import com.mobile.foodtrucks.util.NearRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodtrucksServiceImpl implements FoodtrucksService {

    @Autowired
    private FoodtrucksDao foodtrucksDao;

    @Override
    public List<String> getFoodtrucksInfo(String foodItem) {
        List<String> applicantList = new ArrayList<>();
        try {
            applicantList = foodtrucksDao.findByFoodInfo(foodItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return applicantList;
    }

    @Override
    public List<String> getNearFoodrucks(Double longitude,Double latitude,Double distance) {
        NearRange nearRange = LocationUtils.getNearbyLocation(longitude, latitude, distance);
        List<String> applicantList = new ArrayList<>();
        try {
            applicantList = foodtrucksDao.findNearRange(nearRange);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return applicantList;
    }

    @Override
    public List<FoodTrucksEntity> getDetailByApplicant(String applicant) {
        List<FoodTrucksEntity> trucksEntityList = new ArrayList<>();
        try {
            trucksEntityList = foodtrucksDao.findByApplicant(applicant);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trucksEntityList;
    }
}
