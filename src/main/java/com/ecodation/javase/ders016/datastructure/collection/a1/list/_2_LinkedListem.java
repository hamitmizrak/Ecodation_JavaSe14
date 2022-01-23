package com.ecodation.javase.ders016.datastructure.collection.a1.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//LAV ==> arraylist= Sürekli ekleme,arama yapıyorsak bunu kullanabiliriz
//diamond: java 7 ile geldi
public class _2_LinkedListem {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Ankara");
        list.add("İstanbul");
        list.add("Adıyaman");
        list.add("Diyarbakır");
        list.add("İzmir");

        //listem.clear(); //listeyi boşaltır

        try {

            if (!list.isEmpty()) {
                System.out.println(list.indexOf("Ankara"));
                System.out.println(list.subList(0,2)); //2 dahil değildir 2-1=1
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            list.remove(0);
            System.out.println(list.size());
            System.out.println(list.get(0));
            System.out.println("**********************");
            for (String temp : list) {
                System.out.print(temp + " ");
            }
            System.out.println("");
            //Collections.sort(listem);
            Collections.shuffle(list);
            //Collections.reverse(listem);
            for (String temp : list) {
                System.out.print(temp + " ");
            }

        } catch (IndexOutOfBoundsException e) {
            // e.printStackTrace();
        }


    }

}
