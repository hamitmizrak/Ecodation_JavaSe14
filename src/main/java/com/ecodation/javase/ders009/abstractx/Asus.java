package com.ecodation.javase.ders009.abstractx;

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

    //
    @Override
    public void polymoprhismMethod() {
        System.out.println("Ben Asus Polyorphism");
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Gövdesiz method Asus");
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
