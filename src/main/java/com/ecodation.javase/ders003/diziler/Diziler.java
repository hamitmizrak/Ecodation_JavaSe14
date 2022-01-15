package com.ecodation.javase.ders003.diziler;

import java.util.Arrays;

public class Diziler {


    public static void main(String[] args) {
        //diziler: aynıu türdeki dataları sakladığımız rahatlıkla işlem yapabildiğimiz data structur
        //0 başlar
        //elemansayısı-1 kadar son eleman ulaşırız
        String dizi []  =new  String[5];
        dizi[0]="Java";
        dizi[1]="C#";
        dizi[2]="Docker";
        dizi[3]="Jenkins";
        dizi[4]="sonarQube";


        System.out.println(Arrays.binarySearch( dizi,  "Docker"));
        System.out.println(dizi[dizi.length-1]);
        for ( String temp  : dizi  ) {
            System.out.println(temp);
        }
        /////////////////////////////////////////////////////////
        String dizi2 []  = {"Java1","Java2","Java3"};


        for ( String temp  : dizi2  ) {
            System.out.println(temp);
        }
    }
}
