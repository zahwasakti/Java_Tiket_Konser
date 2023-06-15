package com.app_tiket_konser;

public class Main {
    public static void main(String[] args) {

            TransaksiTiket beli1 = new TransaksiTiket();
            beli1.setPembeli("Orang");
            beli1.setNIK(12864037);
            beli1.setBanyakBeli(2);

            // beli 1
            beli1.setJenis_tiket("Festival");
            beli1.setJumlahBeliTiket(2);

            // beli 2
            beli1.setJenis_tiket("CAT 1");
            beli1.setJumlahBeliTiket(2);

            // cetak transaksi
            beli1.cetak();
    }
}
