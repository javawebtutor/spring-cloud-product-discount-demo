package com.jwt.ms.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.ms.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
