package com.dicoding.javafundamental.propertymethod;

public class Hewan {
//    Property or fields
//    double = desimal
//    Inisiasi dengan nilai inisial
    double tinggi = 180;
    double berat = 50.5;
//    atau bisa melalui konstruktor
    int umur;

    public Hewan(int umurHewan) {
        umur = umurHewan;
    }

    public void cetakHewan() {
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Berat : " + berat);
    }

    public void lari() {
        System.out.println("Berlari dengan sangat cepat...");
    }
    public void jalan() {
        System.out.println("Berjalan dengan sangat lambat...");
    }
    public void makan() {
        System.out.println("Makan dengan menggunakan mulut...");
    }
    public int getUmur() {
        return umur;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getBerat() {
        return berat;
    }
}
