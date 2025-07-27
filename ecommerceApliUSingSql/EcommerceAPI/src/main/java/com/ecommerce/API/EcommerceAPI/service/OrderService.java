package com.ecommerce.API.EcommerceAPI.service;

import com.ecommerce.API.EcommerceAPI.modules.Address;
import com.ecommerce.API.EcommerceAPI.modules.Order;
import com.ecommerce.API.EcommerceAPI.modules.Product;
import com.ecommerce.API.EcommerceAPI.modules.Users;
import com.ecommerce.API.EcommerceAPI.repository.IAddressRepository;
import com.ecommerce.API.EcommerceAPI.repository.IOrderRepository;
import com.ecommerce.API.EcommerceAPI.repository.IProductRepository;
import com.ecommerce.API.EcommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepository iOrderRepository;

    @Autowired
    IProductRepository iProductRepository;

    @Autowired
    IUserRepository iUserRepository;

    @Autowired
    IAddressRepository iAddressRepository;



    //getOrder
    public Order getOrderData(Integer orderId) {
        Optional<Order> listOrder = iOrderRepository.findById(orderId);
        if(listOrder.isEmpty())throw new IllegalStateException("Id is not present in data");
        else return listOrder.get();

    }

    //addOrder
    public String addOrderData(Order order) {
        Users user = order.getUserId();
        Address address = order.getAddressId();
        Product product = order.getProductId();

        Optional<Address> addressOptional =  iAddressRepository.findById(address.getAddressId());
        Optional<Users> userOptional =  iUserRepository.findById(user.getUserId());
        Optional<Product> productOptional =  iProductRepository.findById(product.getProductId());

        if(addressOptional.isEmpty()){
            return "Enter the correct addressID";
        } else if (userOptional.isEmpty()) {
            return "Enter the correct userID";
        } else if (productOptional.isEmpty()) {
            return "Enter the correct productID";
        }else{
            order.setAddressId(addressOptional.get());
            order.setProductId(productOptional.get());
            order.setUserId(userOptional.get());

            iOrderRepository.save(order);
            return "Order placed sucessfully !!!";
        }


}}
