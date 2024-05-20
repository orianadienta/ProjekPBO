package com.javaoop.projekbesarpbo.model;

import java.util.Date;

public class BarangMasuk extends Barang {
    private Date tglBarangMasuk;

    public BarangMasuk(String namaBarang, int jumlahBarang, String satuanBarang, String kodeBarang){
        super(namaBarang, kodeBarang, satuanBarang, jumlahBarang);
        Date barangMasuk = this.tglBarangMasuk;
    }

    public Date getTglBarangMasuk() {
        return tglBarangMasuk;
    }

    public void setTglBarangMasuk(Date tglBarangMasuk) {
        this.tglBarangMasuk = tglBarangMasuk;
    }
}
