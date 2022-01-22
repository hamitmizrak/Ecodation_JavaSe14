package com.ecodation.javase.ders012.software.prensible.a3.composition;

//composition: iki nesnede birbirine bağlı


import java.util.List;


//1
public class Yazar {

    private String yazarAdi;
    private String yazarSoyadi;

    //composition
    private List<Kitap> kitapList;

    public Yazar() {
    }

    //Composition value yazmadım
    public Yazar(String yazarAdi, String yazarSoyadi) {
        this.yazarAdi = yazarAdi;
        this.yazarSoyadi = yazarSoyadi;
    }

    @Override
    public String toString() {
        return "Yazar{" +
                "yazarAdi='" + yazarAdi + '\'' +
                ", yazarSoyadi='" + yazarSoyadi + '\'' +
                ", kitapList=" + kitapList +
                '}';
    }

    //getter and setter
    public String getYazarAdi() {
        return yazarAdi;
    }

    public Yazar setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
        return this;
    }

    public String getYazarSoyadi() {
        return yazarSoyadi;
    }

    public Yazar setYazarSoyadi(String yazarSoyadi) {
        this.yazarSoyadi = yazarSoyadi;
        return this;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public Yazar setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
        return this;
    }
}
