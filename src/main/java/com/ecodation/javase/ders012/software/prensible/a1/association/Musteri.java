package com.ecodation.javase.ders012.software.prensible.a1.association;

//association: classlar arasında bağlantı çok zayıftır.
//1 müşteri o süper market olmadan alışveriş yapabilir.

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Musteri {

    private String musteriAdi;
    private String musteriSehir;

}
