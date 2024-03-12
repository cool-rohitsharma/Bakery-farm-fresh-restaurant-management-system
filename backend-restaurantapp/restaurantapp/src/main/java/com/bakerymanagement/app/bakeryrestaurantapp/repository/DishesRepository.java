package com.bakerymanagement.app.bakeryrestaurantapp.repository;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Dishes;
import jakarta.annotation.Nonnull;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DishesRepository extends JpaRepository<Dishes, Long> {

    Page<Dishes> findByCategories_Id(Long categoryId, Pageable pageable);

    @Nonnull
    Optional<Dishes> findById(@Nonnull Long id);
    void deleteById(@Nonnull Long id);

    Optional<Dishes> findByName(@NonNull String name);
}
