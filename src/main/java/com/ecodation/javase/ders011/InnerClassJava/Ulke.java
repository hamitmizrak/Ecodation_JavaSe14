package com.ecodation.javase.ders011.InnerClassJava;

//inner classlar birden fazla class yazmamıza engel olmak için:
//S.O.L.I.D
//Single Responsibility: 1 class sadece 1 iş yapsın
//java sadece 1 tane public class vardır
//java classlar static olamaz

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//ancak inner classta hem public hemde static olabilir

public class Ulke {
    @Setter @Getter
    private String ulkeAdi;

    //içerdeki class
    public static class Sehir{
        @Setter @Getter
        private String sehirAdi;

        public static class Mahalle{
            @Setter @Getter
            private String mahalleAdi;
        }
    }
}



