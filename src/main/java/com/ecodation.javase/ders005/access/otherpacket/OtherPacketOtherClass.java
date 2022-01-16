package com.ecodation.javase.ders005.access.otherpacket;


import com.ecodation.javase.ders005.access.samepacket.AccessModifier;

public class OtherPacketOtherClass extends AccessModifier{

    public void otherPacketOtherClassMEthod(){
        //instance=örneklemedir.
        AccessModifier accessModifier=new AccessModifier();
        System.out.println(accessModifier.genelErisim);

        System.out.println( this.altClass);
        System.out.println( super.altClass);

    }

    public static void main(String[] args) {
        OtherPacketOtherClass samePacketOtherClass=new OtherPacketOtherClass();
        samePacketOtherClass.otherPacketOtherClassMEthod();
    }
}
