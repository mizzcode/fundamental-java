package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 90;
        char indeksPrestasi;

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else {
            indeksPrestasi = 'E';
        }

        System.out.println("Nilai Indeks Prestasi anda adalah " + indeksPrestasi);
    }
}
