package com.ecodation.javase.ders012.software.prensible.a2.aggregation;

//Aggregation: ilişki tek yönlüdür.
//Mercedes araba motor olmadan çalışmaz ancak Motor araba olmadan kullanabiliriz.

//Motor: bağımsız
//Araba: bağımlı
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Motor {

    private double motorGucu;
    private String motorFiyati;

    public double motorGucu(double motor){
        return motor;
    }
}
