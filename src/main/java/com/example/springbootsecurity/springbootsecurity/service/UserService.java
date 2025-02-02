package com.example.springbootsecurity.springbootsecurity.service;

import com.example.springbootsecurity.springbootsecurity.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<UserEntity> userData = new ArrayList<>();

    public UserService()
    {
        userData.add(new UserEntity("amitmittal","Amit74","amitmittal@gmail.com"));
        userData.add(new UserEntity("abhinamsingh","abhinam36","abhinam@gmail.com"));
    }

    //getAllUsers

    public List<UserEntity> getAllUsers()
    {
        return this.userData;
    }
    //get user based on userName
    public UserEntity getUser(String userName)
    {
        return this.userData.stream().filter((u)-> u.getUserName().equals(userName)).findAny().orElse(null);
    }

//add user
    public UserEntity addUser(UserEntity userEntity)
    {
        this.userData.add(userEntity);
        return userEntity;
    }
}
