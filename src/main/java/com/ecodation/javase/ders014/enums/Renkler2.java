package com.ecodation.javase.ders014.enums;
//enum: numerik :
//genel olarak sürekli kullancağım ve sabit verileri varsa ben enum kullanabilirim
//Renk: Mavi,Yeşil,Turuncu
//Haftanın günleri
//bir yılda 12 ay vardır

//enum,interface,class
//typse safe: tür güvenliğini sağlar. (verilen datanın dışına çıkamam)
//daha estetik kod yazmamı sağlıyor.
//Java 5 gelen bir özelliktir.

public enum Renkler2 {
    //enum ordinal Sıfır(0) başlar
    MAVI (1,"kucukmavi"),YESIL(2,"kucukyesil"),KIRMIZI(3,"kucukmavi"),TURUNCU(4,"kucukturuncu");

    private final int id;
    private final String ifade;

    private  Renkler2(int id, String ifade) {
        this.id = id;
        this.ifade = ifade;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public String getIfade() {
        return ifade;
    }
}
