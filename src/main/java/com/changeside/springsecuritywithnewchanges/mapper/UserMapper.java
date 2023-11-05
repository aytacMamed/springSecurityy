package com.changeside.springsecuritywithnewchanges.mapper;

import com.changeside.springsecuritywithnewchanges.dto.RegisterRequest;
import com.changeside.springsecuritywithnewchanges.dto.UserRequestResponse;
import com.changeside.springsecuritywithnewchanges.entity.User;
import com.changeside.springsecuritywithnewchanges.security.MyUserDetails;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRequestResponse toUserDto(User user);

    User toEntity(UserRequestResponse userRequestResponse);

    MyUserDetails toMyUserDetails(User user);

    User toUserFromRegisterRequest(RegisterRequest request);

}
