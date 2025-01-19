package com.ps.airbnb_psql.service.impl;

import com.ps.airbnb_psql.dto.LoginRequest;
import com.ps.airbnb_psql.dto.Response;
import com.ps.airbnb_psql.entity.User;
import com.ps.airbnb_psql.repo.UserRepository;
import com.ps.airbnb_psql.service.interfac.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;












    @Override
    public Response register(User user) {
        return null;
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response getALlUsers() {
        return null;
    }

    @Override
    public Response getUserBookingHistory() {
        return null;
    }

    @Override
    public Response deleteUser(String userId) {
        return null;
    }

    @Override
    public Response getUserById(String userId) {
        return null;
    }

    @Override
    public Response getMyInfo(String email) {
        return null;
    }
}
