package com.ecodation.javase.ders011.InnerClassJava;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MainTest {
    public static void main(String[] args) {
        Ulke ulke = new Ulke();
        ulke.setUlkeAdi("Türkiye");

        Ulke.Sehir sehir = new Ulke.Sehir();
        sehir.setSehirAdi("İstanbul");

        Ulke.Sehir.Mahalle mahalle=new Ulke.Sehir.Mahalle();
        mahalle.setMahalleAdi("Başakşehir");

        log.info(ulke.getUlkeAdi() + " " + sehir.getSehirAdi()+" "+mahalle.getMahalleAdi());

    }
}
