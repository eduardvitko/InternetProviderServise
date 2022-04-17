package com.servlets;

import com.dao.UserDao;
import com.dto.UserDto;
import com.model.User;
import services.UserService;
import services.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "findUser", urlPatterns = "/user/find")
public class UserFindServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    private UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phone = req.getParameter("phone");

        User user = userService.findByPhoneNumber(phone);
        System.out.println(user);


    }
//    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("user-start.jsp");
//        dispatcher.forward(request, response);
//    }
}
