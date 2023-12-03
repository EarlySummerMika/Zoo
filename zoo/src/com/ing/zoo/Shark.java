package com.ing.zoo;

import static com.ing.zoo.EatingType.CARNIVORE;

/** Shark representation:
 * This class implements all basic methods of the animal class
 */
public class Shark extends Animal {

    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Shark constructor adds a name helloText eatText and eatingType to the Shark object
     * @param name The name given to the Shark
     */
    public Shark(String name) {
        this.name = name;
        this.helloText = "blub blub blub";
        this.eatText = "gawr gawr";
        this.eatingType = CARNIVORE;
    }

    @Override
    public void eatMeat(){
        System.out.println(eatText);
    }

    @Override
    public void performTrick(){
        String trick;
        trick = "You got fooled sharks don't perform tricks, so it bit your leg";
        System.out.println(trick);
    }

    @Override
    public boolean knowsTrick() {
        return true;
    }

    @Override
    public EatingType getEatingType() {
        return eatingType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println("This animal doesn't eat leaves");
    }


}
