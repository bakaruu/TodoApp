package com.springboot.myfristwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("bakaru");
        boolean isValidPassword = password.equalsIgnoreCase("1234");

        return isValidUserName && isValidPassword;
    }
}