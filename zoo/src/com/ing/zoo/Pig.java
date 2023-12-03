package com.ing.zoo;

import java.util.Random;

import static com.ing.zoo.EatingType.OMNIVORE;

/** Pig representation:
 * This class implements all basic methods of the animal class
 */

public class Pig extends Animal{
    private final String name;
    private final String helloText;
    private String eatText;
    private final EatingType eatingType;

    /**
     * Pig constructor adds a name helloText eatText and eatingType to the Pig object
     * @param name The name given to the Pig
     */
    public Pig(String name) {
        this.name = name;
        this.helloText = "oink oink";
        this.eatText = "you have to choose how to feed me";
        this.eatingType = OMNIVORE;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }

    @Override
    public boolean knowsTrick() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EatingType getEatingType() {
        return eatingType;
    }
}
