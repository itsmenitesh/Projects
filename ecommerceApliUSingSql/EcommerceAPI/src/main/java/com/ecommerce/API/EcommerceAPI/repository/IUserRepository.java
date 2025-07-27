package com.ecommerce.API.EcommerceAPI.repository;

import com.ecommerce.API.EcommerceAPI.modules.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
}
