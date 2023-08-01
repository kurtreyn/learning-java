package com.Udemy.lambda;

public class Lambdas {

    public static void main(String[] args) {
        Cat myCat = new Cat();
//        myCat.print();
        printThing(myCat);

        printThing(() -> System.out.println("Meeeoow"));
        Printable lambdaPrintable = () -> System.out.println("Mreow");
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
