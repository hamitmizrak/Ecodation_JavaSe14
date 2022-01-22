package com.ecodation.javase.ders012.software.prensible.a3.composition;

import java.util.ArrayList;

public class CompositionMainTest {

    public static void main(String[] args) {

        //Tek olandan başla
        Yazar yazar=new Yazar();
        yazar.setYazarAdi("Anthony");
        yazar.setYazarSoyadi("Robbins");
        yazar.setKitapList(new ArrayList<>()); //null pointer excepiton

        Kitap kitap=new Kitap();
        kitap.setKitapAdi("Sınırsız Güç");
        kitap.setKitapFiyati("55");
        kitap.setYazar(yazar);
        kitap.getYazar().getKitapList().add(kitap);



        Kitap kitap2=new Kitap();
        kitap2.setKitapAdi("İçindeki Devi uyandır");
        kitap2.setKitapFiyati("100");
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        for ( Kitap temp2 : kitap2.getYazar().getKitapList()){
            System.out.println(temp2);
        }

        System.out.println("Yazar: "+yazar);




    }


}
