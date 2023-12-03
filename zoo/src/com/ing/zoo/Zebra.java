package com.ing.zoo;

import static com.ing.zoo.EatingType.HERBIVORE;

/** Zebra representation:
 * This class implements all basic methods of the animal class
 */
public class Zebra extends Animal{
    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Zebra constructor adds a name helloText eatText and eatingType to the Zebra object
     * @param name The name given to the Zebra
     */
    public Zebra(String name) {
        this.name = name;
        this.helloText = "zebra zebra";
        this.eatText = "munch munch zank yee bra";
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
        System.out.println("This animal doesn't eat meat");
    }

    @Override
    public void performTrick() {
        System.out.println("This Zebra can't even count it's stripes");
    }

    @Override
    public boolean knowsTrick() {
        return false;
    }

    @Override
    public EatingType getEatingType() {
        return eatingType;
    }

    @Override
    public String getName() {
        return name;
    }
}
