package com.bakerymanagement.app.bakeryrestaurantapp.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Orders order;

    @ManyToOne
    private Product product;

    @Column(name = "quantity")
    private int quantity;

}
