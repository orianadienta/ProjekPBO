package com.javaoop.projekbesarpbo.model;

public class ManajemenGudang {
    private Barang barang;

    public ManajemenGudang(Barang barang) {
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}

