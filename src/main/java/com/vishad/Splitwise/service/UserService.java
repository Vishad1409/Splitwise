package com.vishad.Splitwise.service;

import com.vishad.Splitwise.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User signup(String name, String email, String password);
}
