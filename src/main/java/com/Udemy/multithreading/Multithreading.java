package com.Udemy.multithreading;

public class Multithreading {

    public static void main(String[] args) {
        // Create a thread object
        MultithreadThing thread1 = new MultithreadThing(1);
        MultithreadThing thread2 = new MultithreadThing(2);
        MultithreadThing thread3 = new MultithreadThing(3);
        MultithreadThing thread4 = new MultithreadThing(4);
        MultithreadThing thread5 = new MultithreadThing(5);

        // Start the thread
        // Must use start() method to start the thread
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        for(int i=1; i <= 5; i++){
         MultithreadThingTwo thread6 = new MultithreadThingTwo(6);
         Thread myThread = new Thread(thread6);
            myThread.start();

            // useful methods
//            myThread.join();
//            myThread.isAlive();
        }
    }
}
