package com.javaoop.projekbesarpbo.Main;
import com.javaoop.projekbesarpbo.model.Barang;

import java.util.Date;

public class BarangMasuk extends Barang {
    public BarangMasuk(String nama, int jumlah) {
        super(nama, jumlah);
    }

    public void tambahBarangMasuk(Date tanggal) {
        setTglBarangMasuk(tanggal);
    }
}
