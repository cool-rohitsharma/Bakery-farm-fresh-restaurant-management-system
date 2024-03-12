package com.bakerymanagement.app.bakeryrestaurantapp.repository;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Logins;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginsRepository extends JpaRepository<Logins, Long> {

    Optional<Logins> findByLogin(String login);
    @Nonnull
    Optional<Logins> findById(@Nonnull Long id);
}
