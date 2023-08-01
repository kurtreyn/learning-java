package com.Udemy.abstraction;

import java.util.ArrayList;

public class MainInAbstraction {

    public static void main(String[] args){
        Dog dog = new Dog("Wolf", "Medium", 20);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Shark", "large", 1000));

        for(Animal animal : animals){
            doAnimalStuff(animal);
        }
    }


    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("Fast");
    }
}
