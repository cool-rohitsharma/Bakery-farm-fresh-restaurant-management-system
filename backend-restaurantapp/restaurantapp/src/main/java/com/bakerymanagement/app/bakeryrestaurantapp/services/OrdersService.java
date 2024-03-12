package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.OrderItem;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Orders;

import java.util.List;

public interface OrdersService extends BaseService {

    Orders createOrder(String customerId, List<OrderItem> orderItems);
}
