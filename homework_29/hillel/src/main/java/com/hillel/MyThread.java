package com.hillel;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{

    private  int cnt =0;
    public MyThread(int cnt){
        this.cnt = cnt;
    }

    @Override
    public void run(){

        String str = Thread.currentThread().getName();

        for (int i = 0; i <10 ; i++) {

            System.out.printf("Thread %s is Running ... %d\n", str, i );
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
