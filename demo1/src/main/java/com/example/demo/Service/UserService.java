package com.example.demo.Service;


import com.example.demo.Model.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(User user);
}
