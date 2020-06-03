package com.example.ilham;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
        List<Animal> animals = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit){
            System.out.println("Choose what animal you would  like to create[write down the word]: " +
                    "\n choose 1. Shark" +
                    "\n choose 2. Frog" +
                    "\n choose 3. Sheep");
            System.out.print("your answer:");

        String userInput = scanner.nextLine().toLowerCase();
        System.out.print("What is its name?");
        String nameInput = scanner.nextLine().toLowerCase();
        System.out.print("How much does it weigh?");
        double weightInput = scanner.nextDouble();
        scanner.nextLine();
        Animal myAnimal = null;
        switch (userInput) {
            case "shark":
            case "sheep":
            case "frog":
                myAnimal = createAnAnimal(userInput, nameInput, weightInput);
                break;
            default:
                System.err.println("wrong input");
        }

        animals.add(myAnimal);
        System.out.print("would you like to exit?[y/n]");
        String userExits = scanner.nextLine();
        if(userExits.equalsIgnoreCase("y")){
            exit = false;
        }
    }


        Iterator iterator = animals.listIterator();
        System.out.println("Animal list:");
        while(iterator.hasNext()){

            Animal animal = (Animal) iterator.next();
            System.out.println("++++++++"+animal.getName()+"++++++++++");
            animal.eat();
            animal.reproduce();
            animal.move();
            animal.sound();
            animal.breath();
            if(iterator.hasNext()) {
                System.out.println("__________Next Animal______________\n");
            }
        }

    }

    public static Animal createAnAnimal(String animalType,String name, double weight){
        Animal myAnimal;
        if(animalType.equalsIgnoreCase("shark")){
            myAnimal = new Shark(name,weight);
            System.out.println(name+ " has been created");
        }else if(animalType.equalsIgnoreCase("sheep")){
            myAnimal = new Sheep(name,weight);
            System.out.println(name+ " has been created");
        }else{
            myAnimal = new Frog(name,weight);
            System.out.println(name+ " has been created");
        }

        return myAnimal;
    }
}
