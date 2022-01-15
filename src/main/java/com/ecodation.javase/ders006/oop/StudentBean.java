package com.ecodation.javase.ders006.oop;

import java.io.Serializable;

public class StudentBean implements Serializable {
    private static final long serialVersionUID=5151515156L;

    //özellikler
    private int id;
    private String name;

    //parametresiz constructor

    public StudentBean() {
    }

    //parametreli constructor
    public StudentBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //toString

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    //method

    //getter and setter
    public int getId() {
        return id;
    }

    public StudentBean setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentBean setName(String name) {
        this.name = name;
        return this;
    }
}
