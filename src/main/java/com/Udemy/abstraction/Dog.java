package com.Udemy.abstraction;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "Fast"){
            System.out.println(getExplicitType() + " Running");
        } else {
            System.out.println(getExplicitType() + " Walking");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf"){
            System.out.println(getExplicitType() + " Howl");
        } else {
            System.out.println(getExplicitType() + " Bark");
        }
    }
}
