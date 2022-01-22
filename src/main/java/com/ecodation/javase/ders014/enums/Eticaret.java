package com.ecodation.javase.ders014.enums;

public class Eticaret {
    public static void main(String[] args) {
        Renkler renkler=Renkler.TURUNCU;
        System.out.println(renkler);
        System.out.println(renkler.ordinal());
        System.out.println("******************************");
        String kelime=Renkler.MAVI.toString();
        System.out.println(kelime.toLowerCase());
        System.out.println("******************************");
        for( Renkler temp  :Renkler.values()){
            System.out.println(temp);
        }
    }
}
