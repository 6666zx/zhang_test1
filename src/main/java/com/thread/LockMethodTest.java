package com.thread;

public class LockMethodTest implements Runnable{
//    public synchronized  void getLock(){
//        System.out.println("get the lock");
//    }

    @Override
    public void run() {
        try {
            synchronized (this){
                System.out.println("get the lock");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LockMethodTest m1 = new LockMethodTest();
        LockMethodTest m2 = new LockMethodTest();
        Thread th1 = new Thread(m1);
        Thread th2 = new Thread(m2);
        th1.start();
        th2.start();
    }
}
