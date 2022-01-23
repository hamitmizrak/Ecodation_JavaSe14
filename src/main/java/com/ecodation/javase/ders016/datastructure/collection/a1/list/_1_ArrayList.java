package com.ecodation.javase.ders016.datastructure.collection.a1.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//LAV ==> arraylist= Sürekli ekleme,arama yapıyorsak bunu kullanabiliriz
//diamond: java 7 ile geldi
public class _1_ArrayList {

    public static void main(String[] args) {
        List<String> listem = new ArrayList<String>();
        listem.add("Ankara");
        listem.add("İstanbul");
        listem.add("İstanbul");
        listem.add("Adıyaman");
        listem.add("Diyarbakır");
        listem.add("İzmir");

        //listem.clear(); //listeyi boşaltır

        try {

            if (!listem.isEmpty()) {
                System.out.println(listem.indexOf("Ankara"));
                System.out.println(listem.subList(0,2)); //2 dahil değildir 2-1=1
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            listem.remove(0);
            System.out.println(listem.size());
            System.out.println(listem.get(0));
            System.out.println("**********************");
            for (String temp : listem) {
                System.out.print(temp + " ");
            }
            System.out.println("");
            //Collections.sort(listem);
            Collections.shuffle(listem);
            //Collections.reverse(listem);
            for (String temp : listem) {
                System.out.print(temp + " ");
            }

        } catch (IndexOutOfBoundsException e) {
            // e.printStackTrace();
        }


    }

}
