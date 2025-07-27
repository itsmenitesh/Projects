package com.User.management.System.UsermanagementSystem.module;

public class Managment {
    private String UserId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;

    public Managment(String userId, String name, String userName, String address, String phoneNumber) {
        UserId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStatus(boolean status) {
    }
}
