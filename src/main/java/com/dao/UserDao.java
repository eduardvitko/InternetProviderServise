package com.dao;

import com.dto.UserDto;
import com.exceptions.UserException;
import com.model.Role;
import com.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {
    private static final String CREATE_QUERY = "insert into users(id,phone,password,isActive,role,created,updated) values (?,?,?,?,?,?,?)";
    private static final String FIND_BY_FIELD_QUERY = "select * from users where phone = ?";
    private static final String UPDATE_QUERY = "UPDATE users SET item=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE  FROM users WHERE id=?";
    private static final String FIND_ALL_QUERY = "select * from users";
    private static Logger logger = LogManager.getLogger(UserDao.class);


    @Override
    public User create(User user) {
        logger.debug("Start user creating");
        if (user == null) {
            logger.error("user not found");
            throw new UserException("user is not found");
        }


        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement(CREATE_QUERY);) {
            pst.setInt(1, user.getId());
            pst.setString(2, user.getPhone());
            pst.setString(3, user.getPassword());
            pst.setBoolean(4, user.isActive());
            pst.setString(5, String.valueOf(user.getRole()));
            pst.setTimestamp(6, user.convertToTimestamp(user.getCreated()));
            pst.setTimestamp(7, user.convertToTimestamp(user.getUpdated()));

            int status = pst.executeUpdate();
            if (status != 1) throw new UserException("Created more than one record!!");

        } catch (Exception ex) {
            logger.debug("Problem with creating user: " + ex.getMessage());
        }

        logger.debug("User created");

        System.out.println(user.toString());
        return user;
    }

    @Override
    public User findByField(String value) {

        User user = new User();

        logger.debug("Start user searching....");


        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement(FIND_BY_FIELD_QUERY);) {

            pst.setString(1, value);

            ResultSet resultSet = pst.executeQuery();
            resultSet.next();


            user.setPhone(resultSet.getString("phone"));
            user.setPassword(resultSet.getString("password"));
            user.setActive(resultSet.getBoolean("isActive"));
            user.setRole(Role.valueOf(resultSet.getString("role")));
            user.setCreated(LocalDateTime.parse(resultSet.getString("created")));
            user.setUpdated(LocalDateTime.parse(resultSet.getString("updated")));


        } catch (Exception ex) {
            logger.debug("Problem with searching user: " + ex.getMessage());
        }

        logger.debug("User searched");

        System.out.println(user.toString());
        return user;

    }


    @Override
    public User update(User user) {
        User user1 = new User();


        logger.debug("Start user updating....");
        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement(UPDATE_QUERY);) {
            pst.setInt(1, user1.getId());

            user1.setPhone(user.getPhone());
            user1.setPassword(user.getPassword());
            user1.setActive(user.isActive());
            user1.setRole(Role.valueOf(String.valueOf(user.getRole())));
            user1.setCreated(user.getCreated());
            user1.setUpdated(user.getUpdated());

            int status = pst.executeUpdate();
            if (status != 1) throw new UserException("Updated more than one record!!");


        } catch (Exception ex) {

            logger.debug("Problem with updating user: " + ex.getMessage());
        }

        logger.debug("User updated");
        return user1;
    }

    @Override
    public boolean delete(int id) {

        boolean status_boolean = false;
        logger.debug("Start user deleting....");

        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement(DELETE_QUERY);) {
            pst.setInt(1, id);

            int status = pst.executeUpdate();
            if (status == 1) {
                status_boolean = true;
            }
            if (status != 1) throw new UserException("Deleted more than one record!!");
            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with deleting user: " + ex.getMessage());
        }

        logger.debug("User deleted");
        return status_boolean;
    }

    @Override
    public List<User> getAllUsers() {


        logger.debug("Start  searching all users....");
        List<User> userList = null;

        try (Connection con = DataSource.getConnection();
             PreparedStatement pst = con.prepareStatement(FIND_ALL_QUERY);) {
            ResultSet result = pst.executeQuery();
            userList = new ArrayList<>();
            User user = null;
            while (result.next()) {
                user = new User();
                user.setId(result.getInt("id"));
                user.setPhone(result.getString("phone"));
                user.setPassword(result.getString("password"));
                user.setActive(result.getBoolean("isActive"));
                user.setRole(Role.valueOf(result.getString("role")));
                user.setCreated(LocalDateTime.parse(result.getString("created")));
                user.setUpdated(LocalDateTime.parse(result.getString("updated")));
                userList.add(user);

            }


        } catch (Exception ex) {
            logger.debug("Problem with searching all users: " + ex.getMessage());
        }

        logger.debug("All Users searched");
        System.out.println(userList);

        return userList;
    }
}
