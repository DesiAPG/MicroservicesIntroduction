package com.architecture.microservicesintroduction.service.implementation;

import com.architecture.microservicesintroduction.entity.User;
import com.architecture.microservicesintroduction.exceptions.ResourceNotFoundException;
import com.architecture.microservicesintroduction.repository.UserRepository;
import com.architecture.microservicesintroduction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setIdUser(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUsers(String idUser) {
        return userRepository.findById(idUser).orElseThrow(() -> new ResourceNotFoundException("User not found with id" + idUser));
    }
}
