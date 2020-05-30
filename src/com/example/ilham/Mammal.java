package com.example.ilham;

public class Mammal extends Animal {
    public Mammal(String name, double weight) {
        super(name, weight);
    }

    @Override// this overrides the method in Animal
    public void reproduce() {
        System.out.println("Mammals give birth");
        System.out.println("Mammals' reproduce called");
    }
}
