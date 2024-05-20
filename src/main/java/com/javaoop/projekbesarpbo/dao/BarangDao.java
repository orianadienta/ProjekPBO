package com.javaoop.projekbesarpbo.dao;
import com.javaoop.projekbesarpbo.connection.Koneksi;
import com.javaoop.projekbesarpbo.model.Barang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class BarangDao {
    private List<Barang> daftarBarang;

    public BarangDao() {
        this.daftarBarang = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void logBarang() {
        for (Barang barang : daftarBarang) {
            System.out.println("Nama Barang: " + barang.getNamaBarang());
            System.out.println("Jumlah: " + barang.getJumlahBarang());
            System.out.println("Tanggal Barang Masuk: " + (barang.getTglBarangMasuk() != null ? barang.getTglBarangMasuk() : "Belum ditentukan"));
            System.out.println("Tanggal Barang Keluar: " + (barang.getTglBarangKeluar() != null ? barang.getTglBarangKeluar() : "Belum ditentukan"));
            System.out.println("----------------------------");
        }
    }
}
