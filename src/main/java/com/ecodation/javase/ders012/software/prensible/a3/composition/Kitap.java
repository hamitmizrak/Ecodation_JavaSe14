package com.ecodation.javase.ders012.software.prensible.a3.composition;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//N
public class Kitap {

    private String kitapAdi;
    private String kitapFiyati;
    //composition
    private Yazar yazar;

    public Kitap() {
    }

    //Composition value yazmadım
    public Kitap(String kitapAdi, String kitapFiyati) {
        this.kitapAdi = kitapAdi;
        this.kitapFiyati = kitapFiyati;
    }

    //toString


    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapFiyati='" + kitapFiyati + '\'' +
                '}';
    }

    //getter and setter
    public String getKitapAdi() {
        return kitapAdi;
    }

    public Kitap setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
        return this;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }

    public Kitap setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
        return this;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public Kitap setYazar(Yazar yazar) {
        this.yazar = yazar;
        return this;
    }
}


