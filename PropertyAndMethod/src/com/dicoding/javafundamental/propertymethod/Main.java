package com.dicoding.javafundamental.propertymethod;

public class Main {
    public static void main(String[] args) {
        Hewan Kucing = new Hewan(19);
        Kucing.makan();
        Kucing.jalan();
        Kucing.lari();

        System.out.println("Umur : " + Kucing.getUmur());

//        Perhitungan indeks massa tubuh (BMI)
//        berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = Kucing.getBerat() / ((Kucing.getTinggi() * 0.01) * (Kucing.getTinggi() * 0.01));

        System.out.println("Indeks massa tubuh adalah " + bmi);
    }
}
