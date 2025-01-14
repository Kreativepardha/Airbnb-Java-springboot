package com.ps.Airbnb.controller;

import com.ps.Airbnb.dto.Response;
import com.ps.Airbnb.entity.User;
import com.ps.Airbnb.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService userService;

    public ResponseEntity<Response> register(@RequestBody User user) {
        Response response = userService.register(user);
        return  ResponseEntity.status(response.getStatusCode()).body(response);
    }






}
