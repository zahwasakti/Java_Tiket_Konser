package com.app_tiket_konser;

public class Tiket {

    private String jenis_tiket;
    private int harga_tiket;


    public void setJenis_tiket (String Tiket) {
        this.jenis_tiket = Tiket;

        if(Tiket == "Festival") {
            this.harga_tiket = 2000000;
        } else if (Tiket == "CAT 1") {
            this.harga_tiket = 1800000;
        } else if (Tiket == "CAT 2") {
            this.harga_tiket = 1500000;
        } else if (Tiket == "CAT 3") {
            this.harga_tiket = 1000000;
        }
    }

    public String getJenis_tiket() {
        return this.jenis_tiket;
    }
    public int getHarga_tiket() {
        return this.harga_tiket;
    }

}
