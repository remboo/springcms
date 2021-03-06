package com.johnremboo.services;

import com.johnremboo.models.User;

import java.util.List;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
public interface UserService {
    User loadUserByUsername(String username);
    void createUser(User user);
}
