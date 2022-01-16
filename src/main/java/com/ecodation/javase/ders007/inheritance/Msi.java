package com.ecodation.javase.ders007.inheritance;

//java: single inheritance vardır.
//extends keywordu vardır.
public class Msi extends Computer {

    //super üst atadan gelecek bilgileri almak için kullanıyoruz.
    public Msi(String ram, String cpu) {
        super(ram, cpu);
    }
}
