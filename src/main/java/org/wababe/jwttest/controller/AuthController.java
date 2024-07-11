package org.wababe.jwttest.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.wababe.jwttest.dtos.JwtAuthResponse;
import org.wababe.jwttest.dtos.LoginDto;
import org.wababe.jwttest.dtos.RegisterDto;
import org.wababe.jwttest.models.User;
import org.wababe.jwttest.service.AuthService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthService authService;

    // Build Login REST API
    @PostMapping("/login")
    public ResponseEntity<JwtAuthResponse> login(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto);

        JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
        jwtAuthResponse.setAccessToken(token);

        return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);

    }

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody RegisterDto registerUserDto) {
        User user = authService.signup(registerUserDto);
        return ResponseEntity.ok(user);
    }

}
