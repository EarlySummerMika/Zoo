package com.ing.zoo;

import static com.ing.zoo.EatingType.CARNIVORE;

/** Lion representation:
 * This class implements all basic methods of the animal class
 */
public class Lion extends Animal{
    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Lion constructor adds a name helloText eatText and eatingType to the Lion object
     * @param name The name given to the Lion
     */
    public Lion(String name) {
        this.name = name;
        this.helloText = "roooaoaaaaar";
        this.eatText = "nomnomnom thx mate";
        this.eatingType = CARNIVORE;
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {System.out.println("This animal doesn't eat leaves");}

    @Override
    public String getName() {
        return name;
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
    public EatingType getEatingType() {
        return eatingType;
    }
}
