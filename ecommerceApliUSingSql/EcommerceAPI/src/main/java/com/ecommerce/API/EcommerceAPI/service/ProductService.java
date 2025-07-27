package com.ecommerce.API.EcommerceAPI.service;

import com.ecommerce.API.EcommerceAPI.modules.Product;
import com.ecommerce.API.EcommerceAPI.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepository iProductRepository;

    public String addProducts(List<Product> productList) {
        List<Product> list = iProductRepository.saveAll(productList);

        if(list==null){
            return "error";
        }else{
            return "Added";
        }
    }
}
