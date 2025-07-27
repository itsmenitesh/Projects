package com.ResturantModule.RestaurantModel.module;

public class Restaurant {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantId;
    private String specialty;
    private int totalStaff;
    private String Menu;

    public Restaurant(String restaurantName, String restaurantAddress, String restaurantId, String specialty, int totalStaff, String menu) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantId = restaurantId;
        this.specialty = specialty;
        this.totalStaff = totalStaff;
        Menu = menu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String menu) {
        Menu = menu;
    }
}
