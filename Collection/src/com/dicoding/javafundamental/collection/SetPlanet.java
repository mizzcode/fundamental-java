package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        // menggunakan HashSet
        planets.add("venus"); // method add() untuk menambahkan objek ke Set
        planets.add("mars");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("jupiter"); // objek bisa terus ditambahkan ke Set

        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t" + planet);
        }
        planets.remove("venus");

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            // looping menggunakan iterator
            System.out.println("\t" + iterator.next());
        }
    }
}
