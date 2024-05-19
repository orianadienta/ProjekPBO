package com.javaoop.projekbesarpbo.Main;
import com.javaoop.projekbesarpbo.model.Barang;

import java.util.Date;

public class BarangKeluar extends Barang {
    public BarangKeluar(String nama, int jumlah) {
        super(nama, jumlah);
    }

    public void tambahBarangKeluar(Date tanggal) {
        setTglBarangKeluar(tanggal);
    }
}
