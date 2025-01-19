package com.ps.airbnb_psql.service.interfac;

import com.ps.airbnb_psql.dto.LoginRequest;
import com.ps.airbnb_psql.dto.Response;
import com.ps.airbnb_psql.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getALlUsers();
    Response getUserBookingHistory();
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
