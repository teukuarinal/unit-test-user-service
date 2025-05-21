package com.appstest.service;

import com.appstest.model.User;

public interface UserService {
    User createUser(String firstName,
                    String lastName,
                    String email,
                    String password,
                    String repeatPassword);
}
