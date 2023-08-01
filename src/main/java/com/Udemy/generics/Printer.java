package com.Udemy.generics;

public class Printer <T>{
    private T thingToPrint;

    public Printer(T t) {
        this.thingToPrint = t;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
