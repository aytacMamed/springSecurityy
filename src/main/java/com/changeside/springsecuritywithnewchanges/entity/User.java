package com.changeside.springsecuritywithnewchanges.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Long id;


    private String fullName;


    private LocalDate age;

    private String email;

    private String password;


    private Boolean isActive;

    public User(String fullName, LocalDate age) {
        this.fullName = fullName;
        this.age = age;
    }
}