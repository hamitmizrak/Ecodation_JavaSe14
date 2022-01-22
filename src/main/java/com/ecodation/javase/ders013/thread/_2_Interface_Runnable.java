package com.ecodation.javase.ders013.thread;

public class _2_Interface_Runnable implements Runnable {
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


    public static void main(String[] args) {
        Thread thread = new Thread(new _2_Interface_Runnable());
        thread.start();
    }
}
