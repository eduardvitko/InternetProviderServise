package com.servlets;

import com.dao.UserDao;
import services.UserService;
import services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete", urlPatterns = "/user/delete")
public class DeleteServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    private UserDao userDao = new UserDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sid=request.getParameter("id");
        int id1 = Integer.parseInt(sid);
        userService.deleteUser(id1);


    }
}
