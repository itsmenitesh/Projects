package com.ecommerce.API.EcommerceAPI.repository;

import com.ecommerce.API.EcommerceAPI.modules.Order;
import com.ecommerce.API.EcommerceAPI.modules.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {
}
