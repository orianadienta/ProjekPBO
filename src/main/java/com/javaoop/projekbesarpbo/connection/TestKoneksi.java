package com.javaoop.projekbesarpbo.connection;
import com.javaoop.projekbesarpbo.controller.ManajemenGudangController;
import com.javaoop.projekbesarpbo.model.Barang;

import java.sql.*;
import java.util.List;

public class TestKoneksi {
    public static void main(String[] args) {
        try {
            // Memeriksa koneksi database
            checkDatabaseConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void checkDatabaseConnection() {
        Connection connection = null;
        try {
            // Mendapatkan koneksi dari kelas Koneksi
            connection = Koneksi.getConnection();

            ManajemenGudangController controller = new ManajemenGudangController(connection);
            List<Barang> barangList = controller.getAllBarang();

            // Print the results
            if (barangList != null) {
                    System.out.println(barangList);
            } else {
                System.out.println("No data retrieved or an error occurred.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Menutup koneksi database
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

