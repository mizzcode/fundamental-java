package com.dicoding.javafundamental.array;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        int myArr[] = new int[3];

        myArr[0] = 1;
        myArr[1] = 2;
        myArr[2] = 3;
        // akan eror karena melebihi kapasitas dari arrayt
        myArr[3] = 4;
    }
}
