package com.ecodation.javase.ders005.access.samepacket;

public class AccessModifier {

    //public ==> aynı paket(+)  farklı paket(+), aynı class(+), farklı class(+), subclass(+)
    public String genelErisim="Genel erişim değeri";

    //private ==> aynı paket(+)  farklı paket(-), aynı class(+), farklı class(-), subclass(-)
    private String ozelErisim="Özel erişim değeri";

    //protected ==> aynı paket(+)  farklı paket(- ? +), aynı class(+), farklı class(-), subclass(+)
    protected String altClass="alt class erişim değeri";

    //default ==> aynı paket(+)  farklı paket(-), aynı class(+), farklı class(+), subclass(-)
     String defaultErisim="Default erişim değeri";


    public  void samePacketOtherClassMEthod(){
        //instance=örneklemedir.

        System.out.println( this.ozelErisim);
    }

    public static void main(String[] args) {
        AccessModifier accessModifier=new AccessModifier();
        accessModifier.samePacketOtherClassMEthod();
    }

}
