package com.ecodation.javase.ders009.abstractx.inheritance;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract public class Computer {

    private String ram;
    private String cpu;

    //method
    public void polymoprhismMethod() {
        System.out.println("Merhabalar Polymorphism");
    }

    //gövdesiz method
    abstract public void govdesizMethod();

}
