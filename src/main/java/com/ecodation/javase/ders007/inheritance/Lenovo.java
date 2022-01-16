package com.ecodation.javase.ders007.inheritance;

//yeni özellikleri: fan,color
public class Lenovo extends  Computer {

    //nesne değişkenleri
    private String fan;
    private String color;

    public Lenovo() {
    }

    public Lenovo(String ram, String cpu, String fan, String color) {
        super(ram, cpu);//üst atadan geleneleri almak
        this.fan = fan;//global gelen değerleri almak için
        this.color = color;//global gelen değerleri almak için
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "fan='" + fan + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }

    //getter and setter
    public String getFan() {
        return fan;
    }

    public Lenovo setFan(String fan) {
        this.fan = fan;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Lenovo setColor(String color) {
        this.color = color;
        return this;
    }
}
