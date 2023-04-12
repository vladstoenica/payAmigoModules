package com.example.service;

import com.example.clients.UserClient;
import com.example.payAmigo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserClient usersClient;

    public User getUserById(int id) {
        return usersClient.getUserById(id);
    }
}
