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

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        //set all variables for username, email and password
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        //check if variables are null or empty string
        if(username != null && email != null && password != null && !username.isEmpty() && !email.isEmpty() && !password.isEmpty()){
// TODO: create a new user based off of the submitted information
        //instances newUser from User object
        User newUser = new User();
            //setters to set username, email and password
            newUser.setUsername(username);
            newUser.setEmail(email);
            newUser.setPassword(password);
            //use getUserDao() method from DaoFactory
            Users userDao = DaoFactory.getUserDao();
            //use insert method from interface Users
            userDao.insert(newUser);
            // TODO: if a user was successfully created, send them to their profile
            response.sendRedirect("/profile");

        }else {
            response.sendRedirect("/register");
        }


    }
}
