package com.reboot.servo.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.reboot.servo.shared.UserDto;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
    UserDto getUserDetailsByEmail(String email);
    UserDto getUserByUserId(String userId);
}
