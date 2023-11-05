package com.changeside.springsecuritywithnewchanges.services;

import com.changeside.springsecuritywithnewchanges.dto.RegisterRequest;
import com.changeside.springsecuritywithnewchanges.dto.UserPageResponse;
import com.changeside.springsecuritywithnewchanges.dto.UserRequestResponse;
import com.changeside.springsecuritywithnewchanges.entity.User;

public interface UserService {

    UserPageResponse getAll(int page, int count);

    UserRequestResponse getById(int id);


    User saveUser(UserRequestResponse user);

    void deleteUser(int id);

    User getUserByEmail(String email);

    void register(RegisterRequest request);
}