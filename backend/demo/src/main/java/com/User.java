package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import java.util.UUID;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}