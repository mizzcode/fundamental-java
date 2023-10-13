package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
//        Deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Rifky";
        heroes[1] = "Rehan";
//        heroes[2] = "Misbah"; // error ArrayIndexOfBounds karena ukuran Array tetap

//        menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
//        Objek lainnya masih bisa terus ditambahkan ke List
        System.out.println("List Planets Awal :");
        for (int i = 0; i < planets.size(); i++) { // method size untuk mendapatkan ukuran List
//            method get() untuk mendapatkan isi dari ArrayList dan param di isi index nya
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
//        method remove() untuk mengeluarkan objek dari List
        planets.remove("venus");

        System.out.println("List Planet Akhir :");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
