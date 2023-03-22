package com.architecture.microservicesintroduction.service;

import com.architecture.microservicesintroduction.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> listAllUsers();

    User getUsers(String user);

}
