package com.ecodation.javase.ders015.generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
//generics: dinamik type  ==> Java 10 var
public class StudentGenerics <T> {
    private String adi;
    private T yas;

    public <T> void genericMetot(T adi){
        System.out.println(adi);
    }

    public static void main(String[] args) {
        StudentGenerics generics= StudentGenerics.builder().adi("Mehmet").yas(44.55).build();
       log.info(generics);
       generics.genericMetot(44);
    }
}


