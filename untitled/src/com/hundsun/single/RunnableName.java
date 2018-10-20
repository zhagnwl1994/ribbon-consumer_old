package com.hundsun.single;

public class RunnableName implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
