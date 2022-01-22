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
public class Mercedes {

    private String arabaAdi;
    private double arabaFiyati;

   private  Motor motor;

   public Mercedes(){
       motor=new Motor();
   }

    //Mercedes metodu
    public double  createNewCar(double _motor ){
       double toplam=2000+motor.motorGucu(_motor);
        return toplam;
    }


}
