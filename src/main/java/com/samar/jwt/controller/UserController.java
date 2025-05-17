package com.samar.jwt.controller;

import com.samar.jwt.co.UserCreateCO;
import com.samar.jwt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Long> create(@RequestBody UserCreateCO userCreateCO) {

        return ResponseEntity.ok(userService.createUser(userCreateCO));

    }

}
