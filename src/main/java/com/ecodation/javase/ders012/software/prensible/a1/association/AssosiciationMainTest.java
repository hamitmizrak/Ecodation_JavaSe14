package com.ecodation.javase.ders012.software.prensible.a1.association;

public class AssosiciationMainTest {


    public static void main(String[] args) {
        SuperMarket superMarket= SuperMarket.builder().superMarketAdi("Xyz market") .superMarketSehir("Ankara").build();

        Musteri musteri=Musteri.builder().musteriAdi("Müsteri abc").musteriSehir("Ankara").build();

        System.out.println("Assosication: "+"super market adı:"+superMarket.getSuperMarketAdi()+" müşteri adı: "+musteri.getMusteriAdi());

    }

}
