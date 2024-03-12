package com.bakerymanagement.app.bakeryrestaurantapp.domain.dto;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.enumeration.OrderStatus;

import java.util.List;

public class OrderDTO {

    private Long id;
    private String customerName; // Optional
    private String phoneNumber;
    private List<OrderItemDTO> orderItems;
    private double totalAmount;
    private OrderStatus orderStatus;
}
