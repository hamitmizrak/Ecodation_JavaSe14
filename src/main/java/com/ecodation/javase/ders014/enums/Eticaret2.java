package com.ecodation.javase.ders014.enums;

public class Eticaret2 {
    public static void main(String[] args) {
        Renkler2 renkler=Renkler2.TURUNCU;
        System.out.println(renkler);

        System.out.println("****************");

        int renkler2=Renkler2.TURUNCU.getId();
        System.out.println(renkler2);

        System.out.println("****************");

        String renkler3=Renkler2.TURUNCU.getIfade();
        System.out.println(renkler3);

    }
}
