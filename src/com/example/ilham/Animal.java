package com.example.ilham;

public class Animal {
    private String name;

    //Animal has certain weight and let's say in this one in KG.
    private double weight;

    //constructor for animal class
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move(){
        System.out.println("Animal's move() called");
    }

    public void breath(){
        System.out.println("Animal's breath() called");

    }
    public void reproduce(){
        System.out.println("Animal's reproduce() called");
    }

    public void sound(){
        System.out.println("Animal's sound() called");
    }

    public void eat(){
        System.out.println("Animal's eat() called");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
