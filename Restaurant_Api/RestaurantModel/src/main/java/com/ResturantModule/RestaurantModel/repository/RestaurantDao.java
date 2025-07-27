package com.ResturantModule.RestaurantModel.repository;

import com.ResturantModule.RestaurantModel.module.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    private List<Restaurant> restaurantList;
    private RestaurantDao(){
        restaurantList = new ArrayList<>();
        //for temporary check
        restaurantList.add(new Restaurant("OpenSea","siliguri","N771","restro cum bar",25,"chicken,paneer,rice,etc"));
    }
    public List<Restaurant>getRestaurantFromDataSource(){
        return restaurantList;
    }
    public boolean save(Restaurant restaurant){
        restaurantList.add(restaurant);
        return true;
    }
    public boolean remove(Restaurant restaurant){
        restaurantList.remove(restaurant);
        return true;
    }
    public boolean update(String restaurantId , String specialty){
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurant.setSpecialty(specialty);
                return true;
            }
        }
        return false;
    }

}
