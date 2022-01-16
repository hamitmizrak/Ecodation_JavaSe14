package com.ecodation.javase.ders007.inheritance;

//Bilgisayarın genel ortak özelliklere bakalım
//kalıtım: clean codes+ not smell coding +not not spagetti codes, LOC(Line of Codes)
//kalıtım=zamanda kazançtır.

public class Computer {

    //nesne değişkenim:camel case yani ilk karakter küçük sonraki büyük
    private String ram;
    private String cpu;

    //parametresiz constructor: bu class new ile oluşturulduğunda ilk bu metot çalışır
    //constructor: return olmaz, overloading yapabiliriz. başka contructor çağırabiliriz(this)
    //Alt+Insert
    public  Computer () {
    }

    //parametreli constructor: bu class new ile oluşturulduğunda ilk bu metot çalışır
    //constructor: return olmaz, overloading yapabiliriz. başka contructor çağırabiliriz(this)
    //Alt+Insert
    //this: global değişkenleri çağırmak
    //this: diğer constructurları çağırmaya yarar
    public Computer(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    //toString: sistemin kimliğidir.
    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    //getter and setter
    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getCpu() {
        return cpu;
    }

    public Computer setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
}
