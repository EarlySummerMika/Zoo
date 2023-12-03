package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ing.zoo.EatingType.CARNIVORE;
import static com.ing.zoo.EatingType.HERBIVORE;

public class Zoo {
    public static void main(String[] args) {

        // String array created with four positions of commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Array list with animal objects created
        List<Animal> animals = new ArrayList<>();

        // Created new animal species with name
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Otter otto = new Otter("otto");
        Shark shaggy = new Shark("shaggy");

        // Add all the created animals to the animal list
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(otto);
        animals.add(shaggy);

        // Make a scanner to detect input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        // Processing of the input to check if there is an actual command present and animals
        if (!input.trim().isEmpty()) {
            if (!animals.isEmpty()) {
                // Next if the input contains any of the commands from the array
                if (input.contains(commands[0].trim())) {
                    // If the user only inputs the command,
                    // the output will be all animals their name followed by their sayHello command
                    if (input.trim().equals(commands[0])) {
                        for (Animal animal : animals) {
                            System.out.print(animal.getName() + ": ");
                            animal.sayHello();
                        }
                    } else {
                        // Otherwise only the animals whose names have been input will be displayed.
                        for (Animal animal : animals) {
                            if (input.contains(animal.getName())) {
                                System.out.print(animal.getName() + ": ");
                                animal.sayHello();
                            }
                        }
                    }
                } else if (input.contains(commands[1])) {
                    // If the user only inputs the command
                    // the output will be all animals their name followed by their eatLeaves command if they are not a carnivore
                    if (input.trim().equals(commands[1])) {
                        for (Animal animal : animals) {
                            if (animal.getEatingType() != CARNIVORE) {
                                System.out.print(animal.getName() + ": ");
                                animal.eatLeaves();
                            }
                        }
                    } else {
                        // Otherwise only the animals whose name have been input and are not a carnivore will be displayed
                        for (Animal animal : animals) {
                            if (input.contains(animal.getName())) {
                                System.out.print(animal.getName() + ": ");
                                if (animal.getEatingType() != CARNIVORE) {
                                    animal.eatLeaves();
                                } else {
                                    System.out.println("This animal doesn't eat leaves");
                                }
                            }
                        }
                    }
                } else if (input.contains(commands[2])) {
                    // If the user only inputs the command,
                    // the output will be all animals their name followed by their eatMeat command if they are not a herbivore
                    if (input.trim().equals(commands[2].trim())) {
                        for (Animal animal : animals) {
                            if (animal.getEatingType() != HERBIVORE) {
                                System.out.print(animal.getName() + ": ");
                                animal.eatMeat();
                            }
                        }
                    } else {
                        // Otherwise only the animals whose name have been input and are not a herbivore will be displayed
                        for (Animal animal : animals) {
                            if (input.contains(animal.getName())) {
                                System.out.print(animal.getName() + ": ");
                                if (animal.getEatingType() != HERBIVORE) {
                                    animal.eatMeat();
                                } else {
                                    System.out.println("This animal doesn't eat Meat");
                                }
                            }
                        }
                    }
                } else if (input.contains(commands[3])) {
                    // If the user only inputs the command,
                    // the output will be all animals their name followed by their performTrick command if they know one
                    if (input.trim().equals(commands[3].trim())) {
                        for (Animal animal : animals) {
                            if (animal.knowsTrick()) {
                                System.out.print(animal.getName() + ": ");
                                animal.performTrick();
                            }
                        }
                    } else {
                        // Otherwise only the animals whose name have been input and know a trick will be displayed
                        for (Animal animal : animals) {
                            if (input.contains(animal.getName())) {
                                System.out.print(animal.getName() + ": ");
                                if (animal.knowsTrick()) {
                                    animal.performTrick();
                                } else {
                                    System.out.println("This animal doesn't know a trick");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Unknown command: " + input);
                }
            } else {
                System.out.println("There are no animals in this zoo");
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
