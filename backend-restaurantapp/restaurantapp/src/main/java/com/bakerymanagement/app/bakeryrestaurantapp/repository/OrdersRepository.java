package com.bakerymanagement.app.bakeryrestaurantapp.repository;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Orders;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.enumeration.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findOrdersByLoginId(Long id);
    List<Orders> findOrdersByOrderById();

    Optional<Orders> findByIdAndLoginIdAndStatus(Long id, Long loginId, OrderStatus status);

    @Modifying
    @Query("UPDATE Orders o SET o.status = :status WHERE o.id = :id")
    void updateStatus(@Param(value = "id") Long id,
                      @Param(value = "status") OrderStatus status);
}
