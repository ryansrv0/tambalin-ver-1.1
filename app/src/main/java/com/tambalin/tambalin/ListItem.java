package com.tambalin.tambalin;

/**
 * Created by Ryan on 28/05/2017.
 */

public class ListItem {
    private final String Nama;
    private final String Alamat;
    private final String Jam;

    public ListItem(String nama, String alamat, String jam) {
        Nama = nama;
        Alamat = alamat;
        Jam = jam;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getJam() {
        return Jam;
    }
}
