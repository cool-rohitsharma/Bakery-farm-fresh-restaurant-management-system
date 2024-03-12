package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.OrderItem;

public interface OrderItemService extends BaseService {

    void createOrderItem(OrderItem orderItem);
}
