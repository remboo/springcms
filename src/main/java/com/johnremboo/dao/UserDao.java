package com.johnremboo.dao;

import com.johnremboo.models.User;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
public interface UserDao {
    User findByUsername(String username);
    void createUser(User user);
}
