package com.javaoop.projekbesarpbo.connection;
import java.sql.*;

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

            // Memeriksa apakah koneksi berhasil
            if (Koneksi.isConnected()) {
                System.out.println("Koneksi database berhasil!");
            } else {
                System.out.println("Koneksi database gagal!");
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

