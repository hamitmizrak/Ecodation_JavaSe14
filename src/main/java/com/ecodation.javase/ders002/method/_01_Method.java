package com.ecodation.javase.ders002.method;

public class _01_Method {
    //Ctrl+Shift+A

    //1-) voidli parametresiz
    public static void voidliParametresiz() {
        System.out.println("Voidli parametresiz");
    }

    //2-) voidli parametreli
    public static void voidliParametreli(String data) {
        System.out.println("Voidsiz parametreli " + data);
    }

    //3-) voidsiz parametresiz
    public static String voidsizParametresiz() {

        return "Muhammet , Uğur ";
    }

    //4-) voidsiz parametresiz
    public static String voidsizParametreli(String data) {
        return data;
    }

    //Overloading:aşırı yüklemek
    //int number : parametredir
    public static String voidsizParametreli(int number) {

        return number + "";
    }

    //access modifier
    //parametre argüman nedir

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Hamit Mızrak");
        System.out.println(voidsizParametresiz());

        //"Hamit" ==> argümandır
        System.out.println(voidsizParametreli("Hamit"));
        System.out.println(voidsizParametreli(44));

        _02_AccessModifier accessModifier=new _02_AccessModifier();
       // accessModifier.



    }
}
