package com.ResturantModule.RestaurantModel.service;

import com.ResturantModule.RestaurantModel.module.Restaurant;
import com.ResturantModule.RestaurantModel.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;

    public List<Restaurant> getAllRestaurant(){
        return restaurantDao.getRestaurantFromDataSource();
    }

    public  String addRestaurant(Restaurant restaurant){
       boolean insertionStatus = restaurantDao.save(restaurant);
       if(insertionStatus){
           return "New Restaurant added Successfully...!!!";
       }else {
           return "Failed to add new Restaurant...please contact with Developer..!!!";
       }
    }
    public Restaurant getRestaurantBasedOnId(String restaurantId){
        List<Restaurant> restaurantListRightNow= restaurantDao.getRestaurantFromDataSource();
        for(Restaurant restaurant : restaurantListRightNow){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                return  restaurant;
            }
        }
        return null;
    }

    public String removeRestaurantById(String restaurantId){
        boolean deleteResponse = false;
        String status;
        if(restaurantId !=null){
            List<Restaurant> restaurantListRightNow = restaurantDao.getRestaurantFromDataSource();
            for(Restaurant restaurant : restaurantListRightNow){
                if(restaurant.getRestaurantId().equals(restaurantId)){
                    deleteResponse = restaurantDao.remove(restaurant);
                    if(deleteResponse){
                        status = " Restaurant with id " + restaurantId + " has been deleted !!!";
                    }else {
                        status ="Restaurant with id" + restaurantId +"not found..!! its database error contact Developer";

                    }
                    return status;
                }
            }
            return "Restaurant with restaurantId "+ restaurantId + "does not exist !!!";
        }else {
            return "Invalid restaurantId... it cant be null please give appropriate id value ";
        }
    }
    public String updateRestaurantSpecialtyById(String restaurantId , String specialty){
        boolean updateSpecialty = restaurantDao.update(restaurantId , specialty);
        if(updateSpecialty){
            return "Restaurant with restaurantId " + restaurantId + " change in speciality " + specialty + " has been Updated...!!!";
        }else {
            return "Restaurant with restaurantId " + restaurantId + " is not exist so change in speciality wont be possible...!!!";
        }
    }

}
