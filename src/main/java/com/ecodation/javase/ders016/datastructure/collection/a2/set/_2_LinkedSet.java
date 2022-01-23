package com.ecodation.javase.ders016.datastructure.collection.a2.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _2_LinkedSet {
    public static void main(String[] args) {
//hashSet ile LinkedHAshset arasında fark diziliş sırasıdır.
        Set<String> listem = new LinkedHashSet<>();
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
