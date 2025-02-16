package com.example.springbootsecurity.springbootsecurity.controller;

import com.example.springbootsecurity.springbootsecurity.entity.UserEntity;
import com.example.springbootsecurity.springbootsecurity.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }

    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal)
    {
        return principal.getName();
    }
    //get all users
    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers()
    {
        System.out.println();
        return this.userService.getAllUsers();
    }

    @GetMapping("/{userName}")
    public UserEntity getUser(@PathVariable("userName") String userName)
    {
        System.out.println(userName);
        return this.userService.getUser(userName);
    }

    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity userEntity)
    {
        return this.userService.addUser(userEntity);
    }

}
