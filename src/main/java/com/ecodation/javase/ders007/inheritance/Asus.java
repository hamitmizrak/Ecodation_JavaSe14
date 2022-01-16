package com.ecodation.javase.ders007.inheritance;

//Formal= Ctrl+Alt+l
public class Asus extends Computer {
    //nesne değişkeni
    private String asusKeyword;

    //parametresiz constructor
    public Asus() {
    }

    //parametreli constructor
    public Asus(String ram, String cpu, String asusKeyword) {
        super(ram, cpu);
        this.asusKeyword = asusKeyword;
    }

    //getter and setter
    public String getAsusKeyword() {
        return asusKeyword;
    }

    public Asus setAsusKeyword(String asusKeyword) {
        this.asusKeyword = asusKeyword;
        return this;
    }
}
