package com.ecodation.javase.ders013.thread;

public class _1_AnonymousThread {

    public static void main(String[] args) {

        Object object=new Object();
        object=44;
        object=23.55;
        object="Merhabalar";
        //Object ==> String ==> sayısal

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {

                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

    }

}
