package com.ecodation.javase.ders003.diziler;

import java.util.Arrays;

public class FormatterClassTuto {


    public static void main(String[] args) {
        //s d f
        String kelime="MErhabalar";
        int decimal=15;
        float virgullu=44.55f;
        System.out.printf( "%40s  %5d  %.1f",kelime,decimal,virgullu);
    }

}
