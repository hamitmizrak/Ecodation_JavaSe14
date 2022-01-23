package com.ecodation.javase.ders016.datastructure.collection.a2.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _3_TreeSet {
    public static void main(String[] args) {
//TreeSet: tekrarsız ve küçükten büyüğe dorğu sıralama yapar.
        Set<String> listem = new TreeSet<>();
        listem.add("Ankara");
        listem.add("İstanbul");
        listem.add("İstanbul");
        listem.add("Adıyaman");
        listem.add("Diyarbakır");
        listem.add("İzmir");

        Iterator iterator=listem.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");

        }
    }
}
