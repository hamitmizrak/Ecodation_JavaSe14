package com.ecodation.javase.ders005.access.samepacket;

public class SamePacketOtherClass {

    public void samePacketOtherClassMEthod(){
        //instance=örneklemedir.
        AccessModifier accessModifier=new AccessModifier();
        System.out.println(accessModifier.genelErisim);
        System.out.println(accessModifier.altClass);
        System.out.println(accessModifier.defaultErisim);
    }

    public static void main(String[] args) {
        SamePacketOtherClass samePacketOtherClass=new SamePacketOtherClass();
        samePacketOtherClass.samePacketOtherClassMEthod();
    }
}
