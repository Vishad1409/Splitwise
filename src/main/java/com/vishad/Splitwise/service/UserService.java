package com.vishad.Splitwise.service;

import com.vishad.Splitwise.entity.User;

public interface UserService {

    User signup(String name, String email, String password);
}
