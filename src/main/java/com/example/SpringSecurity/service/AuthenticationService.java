package com.example.SpringSecurity.service;

import com.example.SpringSecurity.dto.JwtAuthenticationResponse;
import com.example.SpringSecurity.dto.SignInRequest;
import com.example.SpringSecurity.entity.User;
import com.example.SpringSecurity.dto.SignUpRequest;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signing(SignInRequest signInRequest);
}
