package com.javaoop.projekbesarpbo.controller;

import com.javaoop.projekbesarpbo.dao.ManajemenGudangDao;
import com.javaoop.projekbesarpbo.model.Barang;
import java.util.List;

public class ManajemenGudangController {

    public static List<Barang> getAllBarang() {
        return ManajemenGudangDao.getAllBarang();
    }

    public static void tambahBarang(Barang barang) {
        ManajemenGudangDao.tambahBarang(barang);
    }

    public static void hapusBarang(String namaBarang) {
        ManajemenGudangDao.hapusBarang(namaBarang);
    }

    public static Barang cariBarang(String namaBarang) {
        return ManajemenGudangDao.cariBarang(namaBarang);
    }

    public static void updateBarang(Barang barang) {
        ManajemenGudangDao.updateBarang(barang);
    }
}
