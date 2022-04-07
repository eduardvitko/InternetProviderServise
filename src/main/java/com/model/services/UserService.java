package com.model.services;

import com.dto.UserDto;
import com.model.User;

public interface UserService {
   User registration(UserDto userDto);
   User findByPhoneNumber(String phone);
   boolean promoteUser(String phone);


}
