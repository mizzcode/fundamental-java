package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan{
    private String ras;
    private String habitat;
    public Kucing(String ras, String habitat) {
        this.ras  = ras;
        this.habitat = habitat;
    }
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }
    public Kucing() {
//        walaupun di komentar super(), tetap akan memanggil construct parent class karena Kucing extends Hewan
//        super();
        System.out.println("Consctruct Kucing");
    }

    @Override
    public void makan() { // overriding
        System.out.println("Kucing sedang makan....");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
}
