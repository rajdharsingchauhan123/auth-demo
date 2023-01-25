package com.example.authdemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
@ConfigurationProperties("auth-demo")
@Setter
@Getter
public class LoginConfig {
   private String authUrl;
    private  String loginUrl;
}
