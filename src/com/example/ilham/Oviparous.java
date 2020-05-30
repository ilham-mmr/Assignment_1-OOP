package com.example.ilham;

public class Oviparous extends Animal {
    public Oviparous(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void reproduce() {// this overrides the method in Animal
        System.out.println("Oviparous Animals Lay eggs");
        System.out.println("Oviparous reproduce() called");
    }
}
