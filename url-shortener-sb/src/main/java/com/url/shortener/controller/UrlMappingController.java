package com.url.shortener.controller;

import com.url.shortener.models.UrlMapping;
import com.url.shortener.service.UrlMappingService;
import com.url.shortener.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api/urls")
@AllArgsConstructor
public class UrlMappingController {
    private UrlMappingService urlMappingService;
    private UserService userService;
//{"orignal Url: "httpS://example.com}

    @PostMapping("/shorten")
    public ResponseEntity<UrlMappingDTO> createShortUrl(@RequestBody Map<String ,String> request,
                                                        Principal principal){
           String originalUrl=request.get("originalUrl");
           userService.findByUsername(principal.getName());
          UrlMappingDTO urlMappingDTO = urlMappingService.createShortUrl(originalUrl,user);
           return ResponseEntity.ok(urlMappingDTO);
    }

