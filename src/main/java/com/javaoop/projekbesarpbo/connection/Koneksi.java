package com.javaoop.projekbesarpbo.connection;
import com.javaoop.projekbesarpbo.controller.ManajemenGudangController;
import com.javaoop.projekbesarpbo.model.Barang;

import java.sql.*;
import java.util.List;

public class Koneksi {
    private static Connection connection;

    private Koneksi() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/dbgudang";
            String username = "root";
            String password = "";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url, username, password);
                ManajemenGudangController controller = new ManajemenGudangController(connection);
                List<Barang> barangList = controller.getAllBarang();

                // Print the results
                if (barangList != null) {
                    for (Barang barang : barangList) {
                        System.out.println(barang);
                    }
                } else {
                    System.out.println("No data retrieved or an error occurred.");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isConnected() {
        try {
            if (connection != null && !connection.isClosed()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}