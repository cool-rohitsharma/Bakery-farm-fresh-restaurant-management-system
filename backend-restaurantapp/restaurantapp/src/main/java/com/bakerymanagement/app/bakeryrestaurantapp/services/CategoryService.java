package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.dto.CategoryDTO;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Category;

import java.util.List;

public interface CategoryService extends BaseService {

    public List<CategoryDTO> findAllCategories();
}
