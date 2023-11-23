package com.example.SpringSecurity.dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;

    private String password;
}
