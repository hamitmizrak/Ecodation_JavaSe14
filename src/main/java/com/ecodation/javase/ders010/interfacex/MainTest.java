package com.ecodation.javase.ders010.interfacex;

public class MainTest {
    public static void main(String[] args) {
        Mysql mysql=new Mysql();
        mysql.govdeliMethod();
        mysql.create();
        mysql.delete();
        mysql.list();
        mysql.update();

        System.out.println("***************************");

        Mssql mssql =new Mssql();
        mssql.govdeliMethod();
        mssql.create();
        mssql.delete();
        mssql.list();
        mssql.update();
    }
}
