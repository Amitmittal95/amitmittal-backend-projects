package com.example.springbootsecurity.springbootsecurity.controller;

import com.example.springbootsecurity.springbootsecurity.entity.UserEntity;
import com.example.springbootsecurity.springbootsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //get all users
    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers()
    {
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
