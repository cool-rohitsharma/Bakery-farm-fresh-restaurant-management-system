package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Dishes;

import java.util.List;

public interface DishesService extends BaseService {

    List<Dishes> getDishesByCategory(String category);
}
