package com.ecommerce.API.EcommerceAPI.controller;

import com.ecommerce.API.EcommerceAPI.modules.Product;
import com.ecommerce.API.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/addProducts")
    public String addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }
}
