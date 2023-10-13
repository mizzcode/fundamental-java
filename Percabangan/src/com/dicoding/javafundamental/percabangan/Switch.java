package com.dicoding.javafundamental.percabangan;

public class Switch {
    public static void main(String[] args) {
        int input = 2;
        switch (input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Input anda salah. Hanya tersedia 1 - 3");
        }
    }
}
