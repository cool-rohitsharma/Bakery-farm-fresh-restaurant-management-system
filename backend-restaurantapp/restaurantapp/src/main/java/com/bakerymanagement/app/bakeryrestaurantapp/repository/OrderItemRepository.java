package com.bakerymanagement.app.bakeryrestaurantapp.repository;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
