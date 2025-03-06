package com.vishad.Splitwise.controller;

import com.vishad.Splitwise.dto.UserRegistrationRequestDTO;
import com.vishad.Splitwise.entity.User;
import com.vishad.Splitwise.exception.UserRegistrationInvalidDataException;
import com.vishad.Splitwise.mapper.EntityDTOMapper;
import com.vishad.Splitwise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody UserRegistrationRequestDTO userRegistrationRequestDTO){
        validateUserRegistrationRequestDTO(userRegistrationRequestDTO);
        User savedUser =userService.signup(userRegistrationRequestDTO.getName(),
                userRegistrationRequestDTO.getEmail(), userRegistrationRequestDTO.getPassword());
        return ResponseEntity.ok(
                EntityDTOMapper.toDto(savedUser)
        );
    }
    private void validateUserRegistrationRequestDTO(UserRegistrationRequestDTO requestDTO){
       //To-do by using regex
        // 1. Email validator
        // 2. Password should have 8 char, small, capital, numeric

        if(requestDTO.getEmail() == null ||
                requestDTO.getName() == null||
                requestDTO.getPassword() == null){

            throw new UserRegistrationInvalidDataException("Invalid signup data");
        }
    }
}
