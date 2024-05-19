package com.javaoop.projekbesarpbo.Main;

import java.util.Date;

public class Barang {
    private String nama;
    private int jumlah;
    private Date tglBarangMasuk;
    private Date tglBarangKeluar;

    public Barang(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    // Getters dan Setters
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTglBarangMasuk() {
        return tglBarangMasuk;
    }

    public void setTglBarangMasuk(Date tglBarangMasuk) {
        this.tglBarangMasuk = tglBarangMasuk;
    }

    public Date getTglBarangKeluar() {
        return tglBarangKeluar;
    }

    public void setTglBarangKeluar(Date tglBarangKeluar) {
        this.tglBarangKeluar = tglBarangKeluar;
    }
}