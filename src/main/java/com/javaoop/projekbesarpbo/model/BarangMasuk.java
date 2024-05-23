package com.javaoop.projekbesarpbo.model;

import java.util.*;

public class BarangMasuk extends Barang {
    private Date tglBarangMasuk;
    private List<Barang> daftarBarangMasuk = new ArrayList<>();

    public BarangMasuk(String kodeBarang, String namaBarang, String satuanBarang, int jumlahBarang, Date tglBarangMasuk){
        super(namaBarang, kodeBarang, satuanBarang, jumlahBarang);
        this.tglBarangMasuk = tglBarangMasuk;
    }

    public java.sql.Date getTglBarangMasuk() {
        return (java.sql.Date) tglBarangMasuk;
    }

    public void setTglBarangMasuk(Date tglBarangMasuk) {
        this.tglBarangMasuk = tglBarangMasuk;
    }

    public void tambahBarangKeluar(Barang barang, Date tglBarangKeluar) {
        daftarBarangMasuk.add(barang);
    }
    @Override
    public String toString() {
        return "Barang masuk berhasil ditambahkan";
    }
}
