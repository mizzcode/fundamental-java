package com.dicoding.javafundamental.inputstream;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;

        try {
//            instansiasi objek File
            file = new File(dirname);

//            ambil list files dan masukan ke array string paths
            paths = file.list();

//            looping
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
