package com.reboot.servo.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CreateUserRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2, message = "First name should not be less than 2 characters")
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, message = "Last name should not be less than 2 characters")
    private String lastName;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max = 16, message = "Password must be greater or equal to 8 characters and less than 16 characters")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
}
