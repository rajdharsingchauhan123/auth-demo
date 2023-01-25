package com.example.authdemo.controller;

import com.example.authdemo.bean.LoginDetails;

import com.example.authdemo.config.LoginConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginDetailController {

    @Autowired
    LoginConfig  config;



    @GetMapping("/logindetail")
    public LoginDetails loginDetails(){
      //  return new LoginDetails(login,authURl);
        return new LoginDetails(config.getLoginUrl(), config.getAuthUrl());
    }
}
