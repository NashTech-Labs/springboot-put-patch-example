package com.knoldus.respository;

import com.knoldus.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product, Integer> {


}
