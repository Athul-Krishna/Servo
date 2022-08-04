package com.reboot.servo.shared;

import java.io.Serializable;

import com.reboot.servo.data.Level;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDto implements Serializable {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = -3932282778569812649L;

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String userId;
    private String encryptedPassword;
    private Level level;
}
