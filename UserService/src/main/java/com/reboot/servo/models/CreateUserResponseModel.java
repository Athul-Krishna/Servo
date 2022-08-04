package com.reboot.servo.models;

import com.reboot.servo.data.Level;

import lombok.Data;

@Data
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
    private Level level;
}
