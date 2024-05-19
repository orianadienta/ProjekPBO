package com.javaoop.projekbesarpbo.view;

import java.util.Scanner;

public class BarangView {
    private Scanner scanner;

    public BarangView() {
        this.scanner = new Scanner(System.in);
    }

    public String getInputNama() {
        System.out.print("Masukkan Nama Barang yang Diinginkan: ");
        return scanner.nextLine();
    }

    public int getInputJumlah() {
        System.out.print("Masukkan Jumlah Barang yang Diinginkan: ");
        return scanner.nextInt();
    }

    public int getMenuPilihan() {
        System.out.println("1. Barang yang Akan Masuk");
        System.out.println("2. Barang yang Akan Keluar");
        System.out.println("3. Tampilkan Log Barang");
        System.out.println("4. Selesai");
        System.out.print("Masukkan Pilihan Fitur yang Akan Digunakan: ");
        return scanner.nextInt();
    }
}