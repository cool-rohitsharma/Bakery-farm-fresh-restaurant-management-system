package com.bakerymanagement.app.bakeryrestaurantapp.domain.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

// no validation, send to main page

public class RestaurantDishesDTO {
    private List<DishDTO> dishes;
    private List<CategoryDTO> categories;
    private int currentPage;
    private int totalPages;
    private String sortField;
    private String sortDirection;
    private Long categoryId;
}
