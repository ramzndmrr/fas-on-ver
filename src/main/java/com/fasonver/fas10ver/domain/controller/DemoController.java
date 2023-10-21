package com.fasonver.fas10ver.domain.controller;

import com.fasonver.fas10ver.domain.dto.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/demo")
public class DemoController {

    @GetMapping()
    public String hello(){
        return "hello";
    }

    @GetMapping("/deneme")
    public ResponseEntity<AuthenticationResponse> getRes(){
        AuthenticationResponse auth = new AuthenticationResponse("TOKENTOKEN");
        return ResponseEntity.ok(auth);
    }
}
