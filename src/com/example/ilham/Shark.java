package com.example.ilham;

public class Shark extends Oviparous {
    /*
    Sharks have eyes,teeth and fins
     */
    private int eyes;
    private int teeth;
    private int fins;

    //constructor for Shark class
    // super keyword is used to refer the parent class.
    public Shark(String name, double weight) {
        super(name, weight);
    }



    @Override
    public void move() {
        super.move();
        System.out.println("shark swims");
    }

    @Override
    public void breath() {
        super.breath();
        System.out.println("shark breathes through gills");
    }


    @Override
    public void sound() {
        super.sound();
        System.out.println("no sound");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("a shark eats smaller fish");
    }

    // a bunch of getters and setters are shown below

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
}
