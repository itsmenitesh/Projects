package com.ResturantModule.RestaurantModel.controller;

import com.ResturantModule.RestaurantModel.module.Restaurant;
import com.ResturantModule.RestaurantModel.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    //Show all available restaurant.
    @GetMapping(value = "/getAllRestaurant")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    //add Restaurant
    @PostMapping(value = "/addRestaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    //get restaurant by there ID
    @GetMapping(value = "/getRestaurantId/{restaurantId}")
    public Restaurant getRestaurantId(@PathVariable String restaurantId){
        return restaurantService.getRestaurantBasedOnId(restaurantId);
    }
    //delete restaurant by thee id
    @DeleteMapping(value = "deleteRestaurantById/{restaurantId}")
    public String deleteRestaurantById(@PathVariable String restaurantId){
        return restaurantService.removeRestaurantById(restaurantId);

    }
    //adaptation of  restaurant specialty filed
    @PutMapping(value = "/updateRestaurantSpecialtyById/{restaurantId}/{specialty}")
    public String updateRestaurantSpecialtyById(@PathVariable String restaurantId , @PathVariable String specialty){
        return restaurantService.updateRestaurantSpecialtyById(restaurantId,specialty);
    }




}
