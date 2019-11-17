package com.thread;

import javax.print.attribute.standard.RequestingUserName;

public class Thread1 extends Thread{

    private volatile  int  i = 0;
    @Override
    public void run() {
        System.out.println("start th1");
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);
        Thread thread_1 = new Thread(thread1);
        thread.start();
        thread1.start();
        Thread.sleep(2000);
        System.out.println(thread1.i);
    }
}
