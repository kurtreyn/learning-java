package com.Udemy.generics;

public class GenericsExample {

    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("Hello");
        stringPrinter.print();
        Printer<Integer> integerPrinter = new Printer<>(123);
        integerPrinter.print();
    }
}
