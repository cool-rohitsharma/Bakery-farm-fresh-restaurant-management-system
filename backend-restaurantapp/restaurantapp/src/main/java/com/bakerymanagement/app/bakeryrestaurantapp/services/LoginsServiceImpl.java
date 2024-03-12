package com.bakerymanagement.app.bakeryrestaurantapp.services;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.dto.LoginDTO;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.entity.Logins;
import com.bakerymanagement.app.bakeryrestaurantapp.domain.enumeration.RoleType;
import com.bakerymanagement.app.bakeryrestaurantapp.repository.LoginsRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Optional;


@Slf4j
@Service
public class LoginsServiceImpl implements LoginService {

    private final LoginsRepository loginsRepository;

    @Autowired
    public LoginsServiceImpl(LoginsRepository loginsRepository) {
        this.loginsRepository = loginsRepository;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }

    /**
     * For login user
     * Also use in creating manager if doesn't exists
     * @param login String login
     * @return Login object
     */
    public Optional<Logins> findByUserLogin (@NonNull String login){
        return loginsRepository.findByLogin(login);
    }

    /**
     * Registration
     * @param loginDTO parameters of new user
     * @param role role
     * @return Saved user
     * @throws IllegalArgumentException
     *          if login already exists in database
     */
    public Logins saveNewUser(@NonNull LoginDTO loginDTO, RoleType role) throws NoSuchElementException {
        try {
            return loginsRepository.save(Logins.builder()
                    .login(loginDTO.getLogin())
                    .email(loginDTO.getEmail())
                    .role(role)
                    .time(LocalDateTime.now())
                    .password(new BCryptPasswordEncoder().encode(loginDTO.getPassword())).build());
        }
        catch (Exception e) {
            String message = "error.signup.login.exists";

            throw new IllegalArgumentException(message + loginDTO.getLogin());
        }
    }
}
