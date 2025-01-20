package com.ps.airbnb_psql.controller;


import com.ps.airbnb_psql.dto.LoginRequest;
import com.ps.airbnb_psql.dto.Response;
import com.ps.airbnb_psql.entity.User;
import com.ps.airbnb_psql.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user) {
        Response res = userService.register(user);
        return ResponseEntity.status(res.getStatusCode()).body(res);
    }

    public ResponseEntity<Response> login(@RequestBody LoginRequest loginRequest) {
        Response res = userService.login(loginRequest);
        return ResponseEntity.status(res.getStatusCode()).body(res);
    }


}
