package com.javaoop.projekbesarpbo.dao;

import com.javaoop.projekbesarpbo.connection.Koneksi;
import com.javaoop.projekbesarpbo.model.Barang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManajemenGudangDao {
    private static Connection connection;

    public ManajemenGudangDao(Connection connection) {
        this.connection = connection;
    }

    public static List<Barang> getDaftarBarang() throws SQLException {
        List<Barang> daftarBarang = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tblistbarang WHERE 1");
            while (resultSet.next()) {
                Barang barang = new Barang(resultSet.getString("KodeBarang"),
                resultSet.getString("NamaBarang"),
                resultSet.getString("SatuanBarang"),
                resultSet.getInt("JumlahBarang"));

                daftarBarang.add(barang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return daftarBarang;
    }

    public void tambahBarang(Barang barang) {
        try {
            Connection connection = Koneksi.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tblistbarang (KodeBarang, NamaBarang, SatuanBarang, JumlahBarang) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, barang.getKodeBarang());
            preparedStatement.setString(2, barang.getNamaBarang());
            preparedStatement.setString(3, barang.getSatuanBarang());
            preparedStatement.setInt(4, barang.getJumlahBarang());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void hapusBarang(String namaBarang) {
        try {
            Connection connection = Koneksi.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM tblistbarang WHERE NamaBarang = ?");
            preparedStatement.setString(1, namaBarang);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Barang cariBarang(String namaBarang) {
        Barang barang = null;
        try {
            Connection connection = Koneksi.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tblistbarang WHERE NamaBarang = ?");
            preparedStatement.setString(2, namaBarang);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                barang = new Barang(resultSet.getString("KodeBarang"),
                        resultSet.getString("NamaBarang"),
                        resultSet.getString("SatuanBarang"),
                        resultSet.getInt("JumlahBarang"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return barang;
    }

    public static void updateBarang(Barang barang) {
        try {
            Connection connection = Koneksi.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE tblistbarang SET NamaBarang = ?, SatuanBarang = ?, JumlahBarang = ? WHERE KodeBarang = ?");
            preparedStatement.setString(1, barang.getKodeBarang());
            preparedStatement.setString(2, barang.getNamaBarang());
            preparedStatement.setString(3, barang.getSatuanBarang());
            preparedStatement.setInt(4, barang.getJumlahBarang());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
