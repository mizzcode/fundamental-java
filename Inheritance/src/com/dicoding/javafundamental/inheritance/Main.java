package com.dicoding.javafundamental.inheritance;

public class Main {
        public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("--------------------------");

        Kucing kucing = new Kucing();
        System.out.println("Apakah kucing IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("--------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("whiskas");

        System.out.println("--------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("--------------------------");

        // Object o = new Kucing(); // Kucing adalah Object
        Hewan h = new Kucing(); // Kucing adalah Hewan
        Kucing k = new Kucing(); // Kucing adalah Kucing, pastinya aowkoawk :)

//        o.makan(); // error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        // Object object = k; // bisa langsung di assign
        Hewan hewanK = k; // bisa langsung di assign

//        object.makan(); -> errr, tidak bisa langsung di assign, perlu casting
        hewanK.makan();

//        Kucing kucingK = h; // tidak bisa langsung di assign, perlu casting atau konversi ke tipe object yg sama
        Kucing kucingK = (Kucing) h; // sepert ini bisa karena sudah di assign
        kucingK.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error
        anggora.makan("whiskas");
        }
}
