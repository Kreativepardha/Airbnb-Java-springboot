package com.ps.Airbnb.service.interfac;

import com.ps.Airbnb.dto.LoginRequest;
import com.ps.Airbnb.dto.Response;
import com.ps.Airbnb.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
