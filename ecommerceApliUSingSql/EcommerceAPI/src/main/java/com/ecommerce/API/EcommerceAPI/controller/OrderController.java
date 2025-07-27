package com.ecommerce.API.EcommerceAPI.controller;

import com.ecommerce.API.EcommerceAPI.modules.Order;
import com.ecommerce.API.EcommerceAPI.modules.Users;
import com.ecommerce.API.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    //addOrder
    @PostMapping("/addOrder")
    public String addOrders(@RequestBody Order orders){return orderService.addOrderData(orders);}


    @GetMapping("/getOrder")
    public Order getOrder(@RequestParam Integer orderId){return orderService.getOrderData(orderId);}


}
