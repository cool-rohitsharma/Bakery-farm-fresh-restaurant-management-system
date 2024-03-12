package com.bakerymanagement.app.bakeryrestaurantapp.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Dishes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dish_id_seq")
    @SequenceGenerator(name = "dish_id_seq", sequenceName = "dish_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Pattern(regexp = "^[a-zA-z0-9 -]+$", message = "{error.dish.name_en}")
    @Column(name = "name_en")
    private String nameEn;

    @Min(value = 1/100L, message = "{error.dish.price}")
    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    private LocalDateTime time;
}
