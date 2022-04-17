package services;

import com.dto.UserCreateRequestDto;
import com.model.User;

public interface UserService {
   User registration(UserCreateRequestDto user);
   User findByPhoneNumber(String phone);
   int promoteUser(String phone);
   boolean deleteUser(int id);



}
