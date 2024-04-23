package com.mobile.foodtrucks.service.impl;

import com.mobile.foodtrucks.dao.FoodtrucksDao;
import com.mobile.foodtrucks.model.entity.FoodTrucksEntity;
import com.mobile.foodtrucks.service.FoodtrucksService;
import com.mobile.foodtrucks.util.LocationUtils;
import com.mobile.foodtrucks.util.NearRange;
import com.mobile.foodtrucks.model.vo.FoodTrucksVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Food truck services
 */
@Service
public class FoodtrucksServiceImpl implements FoodtrucksService {

    @Autowired
    private FoodtrucksDao foodtrucksDao;

    @Override
    public List<FoodTrucksVO> getFoodtrucksInfo(String foodItem) {
        List<FoodTrucksEntity> foodTrucksEntitys=foodtrucksDao.findByFoodInfo(foodItem);
        List<FoodTrucksVO> foodTrucksVOList = foodTrucksEntitys.stream().map(list ->{
            FoodTrucksVO foodTrucksVO =new FoodTrucksVO();
            BeanUtils.copyProperties(list, foodTrucksVO);
            return foodTrucksVO;
        }).collect(Collectors.toList());

        return foodTrucksVOList;
    }

    @Override
    public List<FoodTrucksVO> getNearFoodrucks(Double longitude,Double latitude,Double distance) {
        NearRange nearRange = LocationUtils.getNearbyLocation(longitude, latitude, distance);
        List<FoodTrucksEntity> foodTrucksEntitys=foodtrucksDao.findNearRange(nearRange);
        List<FoodTrucksVO> foodTrucksVOList = foodTrucksEntitys.stream().map(list ->{
            FoodTrucksVO foodTrucksVO =new FoodTrucksVO();
            BeanUtils.copyProperties(list, foodTrucksVO);
            return foodTrucksVO;
        }).collect(Collectors.toList());
        return foodTrucksVOList;
    }

    @Override
    public List<FoodTrucksVO> getDetailByApplicant(String applicant) {
        List<FoodTrucksEntity> foodTrucksEntitys=foodtrucksDao.findByApplicant(applicant);
        List<FoodTrucksVO> foodTrucksVOList = foodTrucksEntitys.stream().map(list ->{
            FoodTrucksVO foodTrucksVO =new FoodTrucksVO();
            BeanUtils.copyProperties(list, foodTrucksVO);
            return foodTrucksVO;
        }).collect(Collectors.toList());
        return foodTrucksVOList;
    }
}
