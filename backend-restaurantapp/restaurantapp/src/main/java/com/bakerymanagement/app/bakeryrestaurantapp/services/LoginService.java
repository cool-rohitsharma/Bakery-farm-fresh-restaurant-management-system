package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.dto.LoginDTO;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Logins;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.enumeration.RoleType;

import java.util.Optional;

public interface LoginService extends BaseService {

    boolean authenticate(String username, String password);

    Optional<Logins> findByUserLogin(String manager);

    Logins saveNewUser(LoginDTO build, RoleType roleManager);
}
