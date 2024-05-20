package com.javaoop.projekbesarpbo.dao;

import com.javaoop.projekbesarpbo.model.User;

import java.sql.*;

public class UserDao {
    private static final String URL = "jdbc:mysql://localhost:3306/logindb";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public void register(User user) throws SQLException {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.executeUpdate();
        }
    }

    public User login(String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getString("username"), rs.getString("password"));
                } else {
                    return null;
                }
            }
        }
    }
}

