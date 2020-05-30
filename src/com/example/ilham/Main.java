package com.example.ilham;

public class Main {
    /*

o	What animals have in common are they can move, breath, reproduce and have sound.
o	The animal class is the super class and shares its properties to subclasses which are Mammal and Oviparous.
o	Sheep inherits properties from Mammal while Shark and Frog inherits properties from Oviparous.


    here is the hierarchy of this program

                 Animal
                /      \
               /        \
              /          \
          Oviparous     Mammal
          /     \          |
         /       \       Sheep
       Frog      Shark
    the relationship between superclass and subclass is IS-A
    Mammal IS-A Animal
    Oviparous IS-A Animal
    Frog IS-A Oviparous
    Shark IS-A Oviparous
    Sheep IS-A Mammal

     */

    public static void main(String[] args) {

        //now we come to the interesting part
        //if we instantiate the object shark and reference it to Animal
        // we're limited to only accessing the superclass methods


        Animal jaws = new Shark("Jaws",90); // this is called upcasting. the superclass as reference.
        System.out.println("shark's name: "+jaws.getName());
        jaws.move();
        jaws.breath();
        jaws.sound();
        jaws.reproduce();
        jaws.eat();
        System.out.println("-----------------------------------------------");
        // jaws.setTeeth(); this one shows error
        // but if we change the reference to the shark itself, we can freely access it
        Shark newJaws = (Shark) jaws; //this is called downcasting.
        //now after we cast it, we can access the methods that are not created on super class.
        newJaws.setTeeth(300);
        System.out.println(newJaws.getTeeth());


        System.out.println("________________________________________________");


	    Frog darwin = new Frog("Darwin",0.2);
        System.out.println();
        System.out.println("Frog's name:"+darwin.getName());
        darwin.move();
        darwin.breath();
        darwin.sound();
        darwin.reproduce();
        darwin.eat();
        //below shows the use of method overloading
        darwin.setSkinColor("Green");//set the value
        darwin.setSkinColor("Red",35);
        // get the value
        System.out.println(darwin.getSkinColor());

        System.out.println("________________________________________________");
        Animal shaunTheSheep = new Sheep("Shaun The Sheep",45);
        System.out.println("Sheep's name: "+shaunTheSheep.getName());
        shaunTheSheep.move();
        shaunTheSheep.breath();
        shaunTheSheep.sound();
        shaunTheSheep.reproduce();
        shaunTheSheep.eat();

    }
}
