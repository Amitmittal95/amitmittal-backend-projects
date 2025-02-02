package com.example.springbootsecurity.springbootsecurity.entity;


import lombok.*;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    String userName;
    String password;
    String email;

//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
    public UserEntity(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}