package com.ing.zoo;

import static com.ing.zoo.EatingType.CARNIVORE;

/** Otter representation:
 * This class implements all basic methods of the animal class
 */
public class Otter extends Animal{

    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Otter constructor adds a name helloText eatText and eatingType to the otter object
     * @param name The name given to the Otter
     */
    public Otter(String name) {
        this.name = name;
        this.helloText = "splish splash";
        this.eatText = "cronch cronch cronch";
        this.eatingType = CARNIVORE;
    }

    @Override
    public void eatMeat(){
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves(){System.out.println(eatText);}

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void performTrick(){
        System.out.println("This animal doesn't perform a trick");
    }

    @Override
    public boolean knowsTrick() {
        return false;
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
