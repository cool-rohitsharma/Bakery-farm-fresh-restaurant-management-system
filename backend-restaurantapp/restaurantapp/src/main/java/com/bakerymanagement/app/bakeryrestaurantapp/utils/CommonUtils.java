package com.bakerymanagement.app.bakeryrestaurantapp.utils;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Logins;
import com.bakerymanagement.app.bakeryrestaurantapp.security.UserDetailsImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CommonUtils {

    /**
     * Gets from SecurityContextHolder current authorized user
     * @return Login entity
     */
    public static Logins getAuthorizedLogin() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl) auth.getPrincipal();

        return userDetails.getLogin();
    }
}
