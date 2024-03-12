package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Product;
import com.bakerymanagement.app.bakeryrestaurantapp.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
