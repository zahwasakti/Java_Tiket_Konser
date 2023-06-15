package com.app_tiket_konser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TransaksiTiket extends Tiket implements InfoPembeli {

    private String Pembeli;
    private int nik;
    private int jumlah_tiket = 0;


    private String[] jenis_tiket;
    private int[] harga_tiket;

    private int[] jumlah_pembelian_tiket;
    private int[] jumlahTotal;
    private int index = -1;
    private int total = 0;

    public void setBanyakBeli(int jumlah){
        this.jenis_tiket = new String[jumlah];
        this.harga_tiket = new int[jumlah];
        this.jumlah_pembelian_tiket = new int[jumlah];
        this.jumlahTotal = new int[jumlah];
    }

    public void setJumlahBeliTiket(int jumlah){
        if (this.index == jenis_tiket.length -1) {
            return;
        }

        int currentIndex = ++this.index;

        this.jenis_tiket[currentIndex] = super.getJenis_tiket();
        this.harga_tiket[currentIndex] = super.getHarga_tiket();
        this.jumlah_pembelian_tiket[currentIndex] = jumlah;
        this.jumlahTotal[currentIndex] = jumlah * super.getHarga_tiket();

    }

    public void cetak(){

        System.out.println("Informasi Pemesanan Tiket");
        System.out.printf("Nama : " + this.Pembeli);
        System.out.printf("NIK : " + this.nik);

        String leftAlignFormat = "| %-2s | %-10s | %-10d | %-2d | %-20d %n";
        System.out.format("+---+-------+---------------+---------+--------+------------+%n");
        System.out.format("|No.| Jenis Tiket |  Harga  | Jumlah | Jumlah Total | %n");
        System.out.format("+---+-------+---------------+---------+--------+------------+%n");
        for (int i = 0; i < jenis_tiket.length; i++) {
            int nomor = i + 1;
            String jenisTiket = jenis_tiket[i];
            int harga = harga_tiket[i];
            int jumlah = jumlah_pembelian_tiket[i];
            int Total = jumlahTotal[i];
            total = total + Total;

            if (jenisTiket != null){
                System.out.format(leftAlignFormat, nomor, jenisTiket, harga, jumlah, Total);
            }
        }

    }

    @Override
    public void setPembeli(String name) {

    }

    @Override
    public void setNIK(int nik) {

    }
}


