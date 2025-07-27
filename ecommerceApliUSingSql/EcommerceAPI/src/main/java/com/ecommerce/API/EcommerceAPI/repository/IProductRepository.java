package com.ecommerce.API.EcommerceAPI.repository;

import com.ecommerce.API.EcommerceAPI.modules.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product , Integer> {

}
