package com.ecodation.javase.ders013.thread;

public class _3_Extends_Thread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {

            System.out.println(hashCode()+" hascode==> " +i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _3_Extends_Thread thread1 = new _3_Extends_Thread();
        _3_Extends_Thread thread2 = new _3_Extends_Thread();
        _3_Extends_Thread thread3 = new _3_Extends_Thread();
        thread1.start();

        thread2.start();
        thread3.start();
        thread1.wait();

    }


}
