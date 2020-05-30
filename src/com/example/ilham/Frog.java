package com.example.ilham;

public class Frog extends Oviparous{
    /*
    Frogs have eyes,legs and skinColor
     */
    private int eyes;
    private int legs;
    private String skinColor;
    private double colorOfShades;

    //constructor for Frog class
    // super keyword is used to refer the parent class.
    public Frog(String name, double weight) {
        super(name, weight);

    }


    // in this class we just override the methods and do not call super.
    @Override
    public void move() {
        System.out.println("Frog leaps");
    }

    @Override
    public void breath() {
        System.out.println("frog breathes through lungs and their skin");
    }



    @Override
    public void sound() {
        System.out.println("ribbit");
    }

    @Override
    public void eat() {
        System.out.println("a frog eats insects");
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

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setSkinColor(String skinColor,double colorOfshades){// this additional parameter illustrates the shades value
        this.skinColor = skinColor;
        this.colorOfShades = colorOfshades;
    }


}
