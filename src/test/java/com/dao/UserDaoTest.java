package com.dao;

import com.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private Dao<User> userDao = new UserDao();

    @Test
    void CREATE_USER_POSITIVE_TEST() {
        User user = new User("068", "12345");
        userDao.create(user);
    }
}
