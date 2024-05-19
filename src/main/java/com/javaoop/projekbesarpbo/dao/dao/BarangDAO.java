package com.javaoop.projekbesarpbo.dao.dao;

import com.javaoop.projekbesarpbo.Main.Barang;

import java.util.ArrayList;
import java.util.List;

public class BarangDAO {
    private List<Barang> daftarBarang;

    public BarangDAO() {
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
            System.out.println("Nama Barang: " + barang.getNama());
            System.out.println("Jumlah: " + barang.getJumlah());
            System.out.println("Tanggal Barang Masuk: " + (barang.getTglBarangMasuk() != null ? barang.getTglBarangMasuk() : "Belum ditentukan"));
            System.out.println("Tanggal Barang Keluar: " + (barang.getTglBarangKeluar() != null ? barang.getTglBarangKeluar() : "Belum ditentukan"));
            System.out.println("----------------------------");
        }
    }
}
