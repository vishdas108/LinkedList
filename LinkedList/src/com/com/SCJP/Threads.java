package com.com.SCJP;

public class Threads {

    public static void main(String[] args) {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25; i++) {
                    System.out.println("first runnable");
                }

            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <25 ; i++) {
                    System.out.println("second Runnable");
                }

            }
        });
            thread1.start();
            thread2.start();

        try {
         //   thread2.join();
            thread1.join();// suspend main thread till thread1 is completed.
        } catch (InterruptedException e) {


        }

        System.out.println("main thread");


        /*
        * Java memory model
        *
        *
        * */
    }
}
