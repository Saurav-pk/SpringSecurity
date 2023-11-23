package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.dto.JwtAuthenticationResponse;
import com.example.SpringSecurity.dto.SignInRequest;
import com.example.SpringSecurity.entity.User;
import com.example.SpringSecurity.service.AuthenticationService;
import com.example.SpringSecurity.dto.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signing")
    public ResponseEntity<JwtAuthenticationResponse> signing(@RequestBody SignInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signing(signInRequest));
    }
}
