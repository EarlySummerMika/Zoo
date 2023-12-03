package com.ing.zoo;

import java.util.Random;

import static com.ing.zoo.EatingType.HERBIVORE;

/** Hippo representation:
 * This class implements all basic methods of the animal class
 */

public class Hippo extends Animal {
    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Hippo constructor adds a name helloText eatText and eatingType to the Hippo object
     * @param name The name given to the Hippo
     */
    public Hippo(String name) {
        this.name = name;
        this.helloText = "splash";
        this.eatText = "munch munch lovely";
        this.eatingType = HERBIVORE;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        System.out.println("this animal doesn't eat meat");
    }

    @Override
    public void performTrick() {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "Rolls over";
        }
        else
        {
            trick = "Sits still watching you closely";
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
