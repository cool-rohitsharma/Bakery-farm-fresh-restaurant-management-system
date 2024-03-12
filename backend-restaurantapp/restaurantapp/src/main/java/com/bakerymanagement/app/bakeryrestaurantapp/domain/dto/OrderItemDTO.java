package com.bakerymanagement.app.bakeryrestaurantapp.domain.dto;

import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

// income:
// - for confirm,
// - for payment,
// - for add dish to basket,
// - for delete dish from basket

public class OrderItemDTO {
    @Min(value = 1, message = "{error.itemDTO}")
    private Long itemId;
    private String productName;
    private double price;
    private int quantity;
}
