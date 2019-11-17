package com.cal;

public class Roo implements Runnable{
    @Override
    public void run() {
        System.out.println("yes");
    }

    public static void main(String[] args) {
        new Thread(new Roo()).start();
    }
}
