package com.reboot.servo.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.reboot.servo.data.UserEntity;
import com.reboot.servo.data.UsersRepository;
import com.reboot.servo.shared.UserDto;

@Service
public class UsersServiceImpl implements UsersService {

    UsersRepository usersRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsersServiceImpl(UsersRepository usersRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.usersRepository = usersRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        userDetails.setEncryptedPassword(bCryptPasswordEncoder.encode(userDetails.getPassword()));
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
        usersRepository.save(userEntity);
        UserDto returnValue = modelMapper.map(userEntity, UserDto.class);
        return returnValue;
    }
    
}
