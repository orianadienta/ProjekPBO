package com.javaoop.projekbesarpbo.model;

public class Barang {
    private String namaBarang;
    private String kodeBarang;
    private String satuanBarang;
    private Integer jumlahBarang;

    public Barang(String namaBarang, String kodeBarang, String satuanBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.satuanBarang = satuanBarang;
        this.jumlahBarang = jumlahBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getSatuanBarang() {
        return satuanBarang;
    }

    public void setSatuanBarang(String satuanBarang) {
        this.satuanBarang = satuanBarang;
    }

    public Integer getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(Integer jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public String toString() {
        return "Barang berhasil ditambahkan";
    }
}

