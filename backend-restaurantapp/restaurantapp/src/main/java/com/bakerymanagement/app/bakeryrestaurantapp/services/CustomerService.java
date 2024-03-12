package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Customer;

public interface CustomerService extends BaseService {
    Customer getCustomerById(String customerId);

}
