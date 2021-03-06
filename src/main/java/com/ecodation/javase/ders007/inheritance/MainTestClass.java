package com.ecodation.javase.ders007.inheritance;

public class MainTestClass {
    public static void main(String[] args) {
        //new instance:örnekleme
        System.out.println("********************************************");
        Computer computer = new Computer("ram 4525", "cpu 515");
        //poly(çok)-moprhism(biçimlilik)
        //polymorphism:tek yumurta ikizler
        computer.polymoprhismMethod();
        System.out.println(computer);

        System.out.println("*******************************************");
        Msi msi = new Msi("ram msi 556514554", "cpu msi 65");
        msi.polymoprhismMethod();
        System.out.println(msi);
        //lombok ,constructor,

        System.out.println("*******************************************");
        Asus asus = new Asus(); //parametresiz çağırdı
        asus.setRam("asus ram 666");
        asus.setCpu("Asus CPU 1551");
        asus.setAsusKeyword("Asus klavye 6652ds");
        asus.polymoprhismMethod();
        System.out.println(asus);

        System.out.println("*******************************************");
        Lenovo lenovo = new Lenovo("Lenovo ram:1", "Lenovo cpu:2", "Lenovo fan:3", "Lenovo color: 4");//parametreli construc çağırdı
       lenovo.polymoprhismMethod();
        System.out.println(lenovo.getRam()+" "+ lenovo.getColor()+" "+lenovo.getCpu()+" "+ lenovo.getFan());

    }
}
