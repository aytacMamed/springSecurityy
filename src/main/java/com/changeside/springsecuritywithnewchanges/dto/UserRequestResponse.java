package com.changeside.springsecuritywithnewchanges.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record UserRequestResponse(
// csrf
        @NotNull(message = "fullName can't be null")
        @NotEmpty(message = "fullName can't be empty")
        @NotBlank(message = "fullName can't be blank")
        @Email(message = "You must enter an email")
        @Size(min = 4,message = "minimum length 4")
        String fullName,

        LocalDate age) {

}