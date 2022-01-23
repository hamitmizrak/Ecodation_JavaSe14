package com.ecodation.javase.ders016.datastructure.collection.a3.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTutorials {

    public static void main(String[] args) {
        Map<String,Object> mapList=new HashMap<>();
        mapList.put("1","Malatya");
        mapList.put("2","Denizli");
        mapList.put("3","Kayseri");

        //1.yol
       for(Map.Entry<String,Object> temp: mapList.entrySet()){
           System.out.print(temp+" ");
       }
        System.out.println("\n**************************");
       //2.yol
        mapList.entrySet().forEach(System.out::println);
        System.out.println("\n**************************");
        //3.yol
        Set set=mapList.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println( mapList.get(iterator.next())  );
        }
        System.out.println("\n**************************");
        //Key
        for(String key:mapList.keySet()){
            System.out.print(key+" ");
        }
        System.out.println("\n**************************");
        //Value
        for(Object key:mapList.values()){
            System.out.print(key+" ");
        }

    }
}
