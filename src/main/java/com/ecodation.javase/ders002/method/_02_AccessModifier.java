package com.ecodation.javase.ders002.method;

public class _02_AccessModifier {



    //protected
    //birşey yazmaksa defaulttur:

    public String genel;    //  aynı paket(+) , farklı paket(+) , aynı class(+) farklı class(+) subClass(+) erişim vardır
    protected String araf;  //  aynı paket(+) , farklı paket(-) , aynı class(+) farklı class(+) subClass(+)  erişim vardır
    String defaultDegisken; //  aynı paket(+) , farklı paket(-) , aynı class(+) farklı class(+) subClass(-)  erişim vardır
    private String cimri;   //  aynı paket(+) , farklı paket(-) , aynı class(+) farklı class(-) subClass(-) erişim vardır

    public static void main(String[] args) {
       
    }

}
