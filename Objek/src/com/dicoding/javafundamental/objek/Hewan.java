package com.dicoding.javafundamental.objek;
public class Hewan {
    String nama;
    int berat;
    int jumlahKaki;

//    ini merupakan konstruktor dari kelas hewan.
//    konstruktor adalah method yang pertama kali dijalankan ketika object di ciptakan
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void setBeratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void setJumlahKaki(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat + " kg");
        System.out.println("Jumlah Kaki : " + jumlahKaki);
        System.out.println("");
    }
}