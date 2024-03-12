package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Product;

import java.util.List;

public interface ProductService extends BaseService {

    public List<Product> getAllProducts();
}
