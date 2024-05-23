package com.javaoop.projekbesarpbo.model;

import java.util.*;

public class BarangKeluar extends Barang {
    private Date tglBarangKeluar;
    private List<Barang> daftarBarangKeluar = new ArrayList<>();

    public BarangKeluar(String kodeBarang, String namaBarang, String satuanBarang, Integer jumlahBarang, Date tglBarangKeluar){
        super(namaBarang, kodeBarang, satuanBarang, jumlahBarang);
        this.tglBarangKeluar = tglBarangKeluar;
    }

    public java.sql.Date getTglBarangKeluar() {
        return (java.sql.Date) tglBarangKeluar;
    }

    public void setTglBarangKeluar(Date tglBarangKeluar) {
        this.tglBarangKeluar = tglBarangKeluar;
    }

    public void tambahBarangKeluar(Barang barang, Date tglBarangKeluar) {
        daftarBarangKeluar.add(barang);
    }

    @Override
    public String toString() {
        return "Barang keluar berhasil ditambahkan";
    }
}
