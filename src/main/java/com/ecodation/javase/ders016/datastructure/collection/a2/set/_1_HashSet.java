package com.ecodation.javase.ders016.datastructure.collection.a2.set;

import java.util.*;

public class _1_HashSet {
    public static void main(String[] args) {
//hashSet ile LinkedHAshset arasında fark diziliş sırasıdır.
        Set<String> listem = new HashSet<String>();
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
