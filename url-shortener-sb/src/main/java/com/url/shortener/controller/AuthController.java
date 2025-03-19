package com.url.shortener.controller;

import com.url.shortener.dtos.RegisterRequest;
import com.url.shortener.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    private UserService
    public ResponseEntity<?> resgistetUser(@RequestBody RegisterRequest registerRequest){
        User user =new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setRole("Role_user");
        userService.registerUser(user);
        return ResponseEntity.ok("user registered successfully");

    }
}
