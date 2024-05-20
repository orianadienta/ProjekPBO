package com.javaoop.projekbesarpbo.controller;

import com.javaoop.projekbesarpbo.dao.UserDao;
import com.javaoop.projekbesarpbo.model.User;

import java.sql.SQLException;

public class UserController {
    private UserDao userDao = new UserDao();

    public void register(String username, String password) throws SQLException {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }
        User user = new User(username, password);
        userDao.register(user);
    }

    public User login(String username, String password) throws SQLException {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null");
        }
        return userDao.login(username, password);
    }
}
