package com.Udemy.interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("This Fish is fleeing from bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("This Fish is hunting smaller fish");
    }

}
