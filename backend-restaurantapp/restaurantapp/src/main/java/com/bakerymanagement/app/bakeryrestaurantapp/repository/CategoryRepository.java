package com.bakerymanagement.app.bakeryrestaurantapp.repository;


import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
