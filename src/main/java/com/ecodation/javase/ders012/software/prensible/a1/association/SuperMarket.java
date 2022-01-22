package com.ecodation.javase.ders012.software.prensible.a1.association;

//association: classlar arasında bağlantı çok zayıftır.
//1 super marketin 1 müşterisini kaybederse çalışmaya devam eder.


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuperMarket {

    private String superMarketAdi;
    private String superMarketSehir;

}


