package com.thread;

public class ThreadTest {
    int i = 0;
    class T1 extends Thread{
        private int sum=0;
        @Override
        public void run() {
            synchronized (this) {
                for (int j = 0; j < 100000; j++) {
                    sum++;
                }
            }
        }
    }
    class T2 extends Thread{
        @Override
        public void run() {
//            synchronized (ThreadTest.class) {
                for (int j = 0; j < 100000; j++) {
                    i++;
                }
//            }
        }
    }
    public void execute(){
        T1 t1 = new T1();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.execute();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadTest.i);
    }
}
