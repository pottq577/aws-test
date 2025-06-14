package com.sparta.awstest.domain.user.controller;

import com.sparta.awstest.domain.user.dto.request.CreateUserRequestDto;
import com.sparta.awstest.domain.user.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Getter
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateUserRequestDto request){
        return ResponseEntity.ok(userService.create(request));
    }
}
