package com.vishad.Splitwise.service;

import com.vishad.Splitwise.entity.User;
import com.vishad.Splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User signup(String name, String email, String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        User user= new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(encoder.encode(password));
        return userRepository.save(user);
    }
}
