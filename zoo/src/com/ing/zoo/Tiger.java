package com.ing.zoo;

import java.util.Random;

import static com.ing.zoo.EatingType.CARNIVORE;

/** Tiger representation:
 * This class implements all basic methods of the animal class
 */
public class Tiger extends Animal{
    private final String name;
    private final String helloText;
    private final String eatText;
    private final EatingType eatingType;

    /**
     * Tiger constructor adds a name helloText eatText and eatingType to the Tiger object
     * @param name The name given to the Tiger
     */
    public Tiger(String name) {
        this.name = name;
        this.helloText = "rraaarww";
        this.eatText = "nomnomnom oink wubalubadubdub";
        this.eatingType = CARNIVORE;
    }

    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println("This animal doesn't eat leaves");
    }

    public void eatMeat() {
        System.out.println(eatText);
    }

    public void performTrick() {
        String trick;
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
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

    public String getName() {
        return name;
    }
}
