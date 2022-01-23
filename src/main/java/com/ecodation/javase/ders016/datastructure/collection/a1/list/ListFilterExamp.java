package com.ecodation.javase.ders016.datastructure.collection.a1.list;

import java.util.Arrays;
import java.util.List;

public class ListFilterExamp {
    public static void main(String[] args) {
        Student student1=new Student("adi1","soyadi1");
        Student student11=new Student("adi1","soyadi1");
        Student student2=new Student("adi2","soyadi2");
        Student student3=new Student("adi3","soyadi3");
        Student student4=new Student("adi4","soyadi4");

        List<Student> studentList= Arrays.asList(student1,student11, student2,student3,student4);
        for(Student temp: studentList){
            if(temp.getAdi().equals("adi1")){
                System.out.println(temp);
            }
        }

    }
}
