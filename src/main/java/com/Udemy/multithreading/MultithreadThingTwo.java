package com.Udemy.multithreading;

public class MultithreadThingTwo implements Runnable{

    private int threadNumber;

    public MultithreadThingTwo(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i=1; i <= 5; i++){
            System.out.println("From thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
