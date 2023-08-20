package com.Udemy.interfaces;

public class MainInterfaceTwo {

    public static void main(String[] args) {

//        interface = a template that can be applied to a class
//            similar to inheritance, but specifies what a class has/must do
//            classes can apply more than one interface, inheritance is limited to one super class
//        properties on an interface are public static final by default
//        methods on an interface are public abstract (except static and default methods)
//            public abstract is redundant
//        interfaces cannot be instantiated directly
//            a concrete class must implement the interface
//        interfaces are used to achieve abstraction

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

    }
}
