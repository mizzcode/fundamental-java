package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char input = 'B';
        int output = 0;

        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai Output = " + output);
    }
}
