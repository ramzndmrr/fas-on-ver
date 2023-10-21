package com.fasonver.fas10ver.domain.controller;

import com.fasonver.fas10ver.domain.dto.AuthenticationRequest;
import com.fasonver.fas10ver.domain.dto.AuthenticationResponse;
import com.fasonver.fas10ver.domain.dto.RegisterRequest;
import com.fasonver.fas10ver.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register-textile")
    public ResponseEntity<AuthenticationResponse> registerUser(@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(authenticationService.registerUser(request));
    }

    @PostMapping("/register-company")
    public ResponseEntity<AuthenticationResponse> registerCompany(@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(authenticationService.registerCompany(request));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return  ResponseEntity.ok(authenticationService.authenticate(request));
    }

}
