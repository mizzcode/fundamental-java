package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

//        call method main menu
        mainMenu();

        switch (pilihan) {
            case '1' : {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();

                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();

                System.out.println("Luas persegi panjang: " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1, s2));

                break;
            }
            case '2' : {
                System.out.print("Masukan alas segitiga: ");
                s1 = scanner.nextInt();

                System.out.print("Masukan tinggi segitga: ");
                s2 = scanner.nextInt();

                System.out.println("Luas segitiga siku: " + osegitiga.luas(s1, s2));
                System.out.println("Keliling segitiga siku: " + osegitiga.keliling(s1, s2));

                break;
            }
            case '3' : {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();

                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));

                break;
            }
            default:
                System.out.println("pilihan tidak dimengerti");
                break;
        }
    }

    private static void mainMenu() {
//        Pilihan menu
        System.out.println("====================");
        System.out.println("Hitung luas dan keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");

        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
