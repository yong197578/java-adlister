package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //set userDao to use getUserDao() from DaoFactory
        Users userDao = DaoFactory.getUserDao();
        // TODO: make sure we find a user with that username
        User user = userDao.findByUsername(username);

       // TODO: find a record in your database that matches the submitted password
        boolean validAttempt = (user != null && password.equals(user.getPassword()));

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
            // TODO: check the submitted password against what you have in your database
            //if password does not match redirect to login page
        } else {
            response.sendRedirect("/login");
        }
    }
}
