package com.bakerymanagement.app.bakeryrestaurantapp.repository;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
