package com.Udemy.abstraction;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "Fast"){
            System.out.println(getExplicitType() + " Darting");
        } else {
            System.out.println(getExplicitType() + " Swimming lazily");
        }
    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.println(getExplicitType() + " swish");
        } else {
            System.out.println(getExplicitType() + " splash");
        }
    }
}
