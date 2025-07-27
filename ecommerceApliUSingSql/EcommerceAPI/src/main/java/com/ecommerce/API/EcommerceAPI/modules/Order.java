package com.ecommerce.API.EcommerceAPI.modules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private  Product productId;

    @ManyToOne
    @JoinColumn(name = "address_id")
   private  Address addressId;

    private Integer productQuantity;



}
