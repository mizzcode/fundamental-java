package com.dicoding.tipedata.basic;

public class Main {
    public static void main(String[]args) {
        // array yang berisi beberapa karakter
        char[] charsDicoding = {'D','I','C','O','D','I','N','G'};
        // ingin jadikan sebuah string
        String dicoding = new String(charsDicoding);
        System.out.println(dicoding);

        // membuat string
        String name = "    Mizz    ";
        int age = 19;
        String address = "Blubuk Village No 21. Dukuhwaru. Kab.Tegal 52451";

        // untuk menghitung panjang karakter
        int dicodingLength = dicoding.length();
        System.out.println(dicodingLength);

        // mengambil karakter tertentu dari string
        char result = dicoding.charAt(7);
        System.out.println(result);

        // mengecek apakah apakah sebuah string kosong atau tidak
        System.out.println(dicoding.isEmpty());

        // mengubah format string menjadi huruf kecil semua
        System.out.println(dicoding.toLowerCase());

        // mengubah format string menjadi huruf besar semua
        System.out.println(dicoding.toUpperCase());

        // menghapus spasi awal dan akhir dari string
        System.out.println(name);
        System.out.println(name.trim());
    }
}
