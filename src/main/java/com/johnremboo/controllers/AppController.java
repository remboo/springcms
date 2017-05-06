package com.johnremboo.controllers;

import com.johnremboo.models.User;
import com.johnremboo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
@Controller
@RequestMapping("/")
public class AppController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{username}")
    @ResponseBody
    public User findByUsername(@PathVariable String username) {
        return userService.loadUserByUsername(username);
    }

    @RequestMapping("/new/{username}")
    @ResponseStatus(value = HttpStatus.OK)
    public void createUser(@PathVariable String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("123456");
        userService.createUser(user);
    }

}
