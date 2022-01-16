package com.ecodation.javase.ders009.abstractx;

public class MainTestClass {
    public static void main(String[] args) {
        //new instance:örnekleme

        //abstract: new oluşturulmaz
        //Computer computer = new Computer("ram 4525", "cpu 515");
        //poly(çok)-moprhism(biçimlilik)
        //polymorphism:tek yumurta ikizler
        // computer.polymoprhismMethod();
        //System.out.println(computer);

        //System.out.println("*******************************************");
        Asus asus = new Asus(); //parametresiz çağırdı
        asus.setRam("asus ram 666");
        asus.setCpu("Asus CPU 1551");
        asus.setAsusKeyword("Asus klavye 6652ds");
        asus.polymoprhismMethod();
        System.out.println(asus);

        Computer asus2 = new Asus(); //polymorphism
        asus2.setRam("asus ram 666");
        asus2.setCpu("Asus CPU 1551");
        asus2.polymoprhismMethod();
        System.out.println(asus2);

    }
}
