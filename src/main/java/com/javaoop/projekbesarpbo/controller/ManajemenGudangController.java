package com.javaoop.projekbesarpbo.controller;

import com.javaoop.projekbesarpbo.dao.ManajemenGudangDao;
import com.javaoop.projekbesarpbo.model.Barang;
import com.javaoop.projekbesarpbo.model.ManajemenGudang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ManajemenGudangController {
    private ManajemenGudangDao manajemenGudangDao;
    private Connection connection;

    public ManajemenGudangController(Connection connection) {
        this.connection = connection;
        this.manajemenGudangDao = new ManajemenGudangDao(connection);
    }

    public static List<Barang> getAllBarang() {
        try {
            return ManajemenGudangDao.getAllBarang();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}