package com.ecodation.javase.ders016.datastructure.collection.a1.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListShow {

    public static void main(String[] args) {
        List<String> listShow = new ArrayList<String>();
        listShow.add("Ankara");
        listShow.add("İstanbul");
        listShow.add("Adıyaman");
        listShow.add("Diyarbakır");
        listShow.add("İzmir");


        //1-iterative for
        for(int i=0; i<listShow.size(); i++){
            System.out.print(listShow.get(i)+" ");
        }
        System.out.println("\n********************************************");

        //2-forEach döngüsü
        for (String temp   :listShow){
            System.out.print(temp+" ");
        }
        System.out.println("\n********************************************");

        //3-Iterator
        Iterator iterator=listShow.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");

        }
        System.out.println("\n********************************************");
        //4 Stream API
        listShow.stream().forEach(System.out::println);
    }
}
