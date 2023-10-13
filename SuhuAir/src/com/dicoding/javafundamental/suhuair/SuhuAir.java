package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {

        int T;

//        Program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

//        Scanner untuk masukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((T > 0) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
