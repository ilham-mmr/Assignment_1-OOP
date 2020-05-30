package com.example.ilham;

public class Sheep extends Mammal {
    /*
    sheep have eyes, legs. some sheep are shaved so they don't have wool but some do.
    that's why the name of the attribute is hasWool. it returns true if sheep have wool.
     */
    private int eyes;
    private int legs;
    private boolean hasWool;

    //constructor for Sheep class
    // super keyword is used to refer the parent class.
    public Sheep(String name, double weight) {
        super(name, weight);
    }



    // in this class we just override the methods and do not call super.
    @Override
    public void move() {
        System.out.println("sheep walks");
    }

    @Override
    public void breath() {
        System.out.println("sheep breathes through lungs");
    }


    @Override
    public void sound() {
        System.out.println("mbee");
    }

    @Override
    public void eat() {
        System.out.println("a sheep eats grass");
    }

    // a bunch of getters and setters are shown below
    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean HasWool() {
        return hasWool;
    }

    public void setHasWool(boolean hasWool) {
        this.hasWool = hasWool;
    }
}
