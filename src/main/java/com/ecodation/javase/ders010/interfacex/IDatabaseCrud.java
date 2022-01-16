package com.ecodation.javase.ders010.interfacex;

//Dikkat: interface private olmaz
//Gövdelisiz metot yazdık
//gövdeli için public yerine default yazılır
//siz onceden soz veriyorsunuz sonra bu soz yerine getiriyoruz
//gövdesiz metotlar yazıyoruz.
//implements istediğimiz kadar interface ekleyebiliriz.
public interface IDatabaseCrud {
    public void create();
    public void delete();
    public void update();
    public void list();

    //govdeli metot
    default void govdeliMethod(){
        System.out.println("Gövdeli method ");
    }
}
