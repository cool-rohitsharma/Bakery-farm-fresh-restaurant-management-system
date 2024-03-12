package com.bakerymanagement.app.bakeryrestaurantapp.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

// no validation, send to main page in PageableDishesDTO

public class CategoryDTO {
    private Long id;
    private String category;
}
