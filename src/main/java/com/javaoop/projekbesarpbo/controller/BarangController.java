package com.javaoop.projekbesarpbo.controller;

import com.javaoop.projekbesarpbo.Main.BarangKeluar;
import com.javaoop.projekbesarpbo.Main.BarangMasuk;
import com.javaoop.projekbesarpbo.dao.dao.BarangDAO;
import com.javaoop.projekbesarpbo.view.BarangView;

import java.util.Date;
import java.util.Scanner;

public class BarangController {
    private BarangDAO barangDAO;
    private BarangView barangView;

    public BarangController(BarangDAO barangDAO, BarangView barangView) {
        this.barangDAO = barangDAO;
        this.barangView = barangView;
    }

    public void mulai() {
        int pilihan;
        do {
            pilihan = barangView.getMenuPilihan();
            switch (pilihan) {
                case 1:
                    tambahBarangMasuk();
                    break;
                case 2:
                    tambahBarangKeluar();
                    break;
                case 3:
                    tampilkanLog();
                    break;
                case 4:
                    System.out.println("Pilihan Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    private void tambahBarangMasuk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang yang Diinginkan: ");
        String nama = scanner.nextLine();

        int jumlah;
        do {
            System.out.print("Masukkan Jumlah Barang yang Diinginkan: ");
            jumlah = scanner.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah Barang yang Dimasukkan Tidak valid. Masukkan Jumlah Barang yang Benar.");
            }
        } while (jumlah <= 0);

        BarangMasuk barangMasuk = new BarangMasuk(nama, jumlah);
        Date tanggalMasuk = new Date();
        barangMasuk.tambahBarangMasuk(tanggalMasuk);
        barangDAO.tambahBarang(barangMasuk);
        System.out.println("Barang " + nama + " Dengan Jumlah " + jumlah + " Berhasil di Tambahkan Pada " + tanggalMasuk + ".");
    }

    private void tambahBarangKeluar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang yang Diinginkan: ");
        String nama = scanner.nextLine();

        int jumlah;
        do {
            System.out.print("Masukkan Jumlah Barang yang Diinginkan: ");
            jumlah = scanner.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah Barang Tidak yang Dipilih Valid. Masukkan Jumlah Barang Yang Benar.");
            }
        } while (jumlah <= 0);

        BarangKeluar barangKeluar = new BarangKeluar(nama, jumlah);
        Date tanggalKeluar = new Date();
        barangKeluar.tambahBarangKeluar(tanggalKeluar);
        barangDAO.tambahBarang(barangKeluar);
        System.out.println("Barang " + nama + " Dengan Jumlah " + jumlah + " Telah Keluar Pada " + tanggalKeluar + ".");
    }

    private void tampilkanLog() {
        barangDAO.logBarang();
    }
}

