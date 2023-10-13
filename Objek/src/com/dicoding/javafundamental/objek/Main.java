package com.dicoding.javafundamental.objek;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.setBeratHewan(5);
        Elang.setJumlahKaki(2);
        Elang.cetakHewan();

        Kucing.setBeratHewan(3);
        Kucing.setJumlahKaki(4);
        Kucing.cetakHewan();
    }
}
