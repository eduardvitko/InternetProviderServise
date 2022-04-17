package com.dao;

import com.dto.UserDto;
import com.model.Limit;
import com.model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private Dao<User> userDao = new UserDao();

    /*USER______________________________________________*/

    //CREATE USER TESTS

    @Test
    void CREATE_USER_POSITIVE_TEST() {
        User user = new User("380631256897", "rojgfd112");
        userDao.create(user);
    }
    @Test
    void CREATE_USER_NEGATIVE_IS_NULL_PHONE_TEST(){
        User user = new User(null,"12365");
        userDao.create(user);
    }
    @Test
    void CREATE_USER_NEGATIVE_IS_NULL_PASSWORD_TEST(){
        User user = new User("380504120365",null);
        userDao.create(user);
    }
    @Test
    void CREATE_DUPLICATE_USER_NEGATIVE_TEST(){
        User user = new User("069","12345");
        userDao.create(user);
    }


    //FIND_BY USER

    @Test
    void FIND_BY_FIELD_POSITIVE_TEST(){
        User user = userDao.findByField("380631256897");

    }
    @Test
    void FIND_BY_FIELD_NEGATIVE_TEST(){
        User user = userDao.findByField("null");

    }

    // GET_ALL_USERS
    @Test
    void FIND_ALL_USERS_POSITIVE_TEST(){
        List<User> userList = new ArrayList<>();
        userList =  userDao.getAllUsers();

    }

}
