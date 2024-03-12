package com.bakerymanagement.app.bakeryrestaurantapp.domain.entity;

import com.bakerymanagement.app.bakeryrestaurantapp.domain.enumeration.RoleType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table( name="login",
        uniqueConstraints={@UniqueConstraint(columnNames={"login"})})
public class Logins {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleType role;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime time;
}
