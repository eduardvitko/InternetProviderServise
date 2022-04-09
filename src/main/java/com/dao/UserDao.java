package com.dao;

import com.exceptions.UserException;
import com.model.Role;
import com.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements Dao<User> {

    private static Logger logger = LogManager.getLogger(UserDao.class);

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            logger.debug("Connecting to data base...");
            con = DriverManager.getConnection("jdbc:mysql:@localhost:3306:internet_provider_base", "root", "root");
        } catch (Exception e) {
            logger.debug("Problem with connection to data base: " + e.getMessage());
        }
        return con;
    }

    @Override
    public User create(User user) {
        logger.debug("Start user creating");


        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "insert into user(id,phone,password,isActive,role,created,updated) values (?,?,?,?,?,?,?)");
            ps.setInt(1, user.getId());
            ps.setString(2, user.getPhone());
            ps.setString(3, user.getPassword());
            ps.setBoolean(4, user.isActive());
            ps.setString(5, String.valueOf(user.getRole()));
            ps.setDate(6, Date.valueOf(user.getCreated()));
            ps.setDate(7, Date.valueOf(user.getUpdated()));

            int status = ps.executeUpdate();
            if (status != 1) throw new UserException("Created more than one record!!");

            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with creating user: " + ex.getMessage());
        }

        logger.debug("User created");


        return user;
    }

    @Override
    public User findByField(String value) {

        User user = new User();

        logger.debug("Start user searching....");


        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "select * from users where value =?");

            ps.setString(1, value);

            ResultSet resultSet = ps.executeQuery();
            resultSet.next();


            user.setPhone(resultSet.getString("phone"));
            user.setPassword(resultSet.getString("password"));
            user.setActive(resultSet.getBoolean("isActive"));
            user.setRole(Role.valueOf(resultSet.getString("role")));


            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with searching user: " + ex.getMessage());
        }

        logger.debug("User searched");


        return user;
    }

    @Override
    public int update(User user) {

        User update_user = new User();
        int status = 0;

        logger.debug("Start user updating....");


        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE users SET item=? WHERE phone=?");

            ps.setString(2, user.getPhone());



            update_user.setPassword(user.getPassword());
            update_user.setActive(user.isActive());
            update_user.setRole(Role.valueOf(String.valueOf(user.getRole())));

            status = ps.executeUpdate();
            if (status != 1) throw new UserException("Updated more than one record!!");

            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with updating user: " + ex.getMessage());
        }

        logger.debug("User updated");
        return status;
    }

    @Override
    public boolean delete(int id) {

        return true;
    }
        @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        logger.debug("Start  searching all users....");


        try {
            Connection con = getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "select * from users");


            ResultSet result = ps.executeQuery();

            while (result.next()) {
                User user = new User();
                user.setId(result.getInt("id"));
                user.setPhone(result.getString("phone"));
                user.setPassword(result.getString("password"));
                user.setActive(result.getBoolean("isActive"));
                user.setRole(Role.valueOf(result.getString("role")));
//                user.setCreated(Date.valueOf(result.getDate());
//                user.setUpdated(Date.valueOf(result.getDate()));

            }

            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with searching all users: " + ex.getMessage());
        }

        logger.debug("All Users searched");

        return userList;
    }
}
