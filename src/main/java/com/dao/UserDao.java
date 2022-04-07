package com.dao;

import com.exceptions.UserException;
import com.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

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
            ps.setInt(1,user.getId());
            ps.setString(2, user.getPhone() );
            ps.setString(3, user.getPassword() );
            ps.setBoolean(4, user.isActive());
            ps.setString(5, String.valueOf(user.getRole()));
            ps.setDate(6,Date.valueOf(user.getCreated()));
            ps.setDate(7,Date.valueOf(user.getUpdated()));

            int status = ps.executeUpdate();
            if (status != 1) throw new UserException("Created more than one record!!");

            con.close();
        } catch (Exception ex) {
            logger.debug("Problem with creating user: " + ex.getMessage());
        }

        logger.debug("User created");


        return null;
    }

    @Override
    public User findByField(String value) {
        return null;
    }

    @Override
    public int update(User item) {
        return 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
