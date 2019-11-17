package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RetranLockTest {

    public void lock(){
        ReentrantReadWriteLock lock =  new ReentrantReadWriteLock();
        lock.writeLock().lock();

    }
}
