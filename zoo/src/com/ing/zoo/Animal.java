package com.ing.zoo;

/** Animal representation:
 * This class implements basic methods for all animals type classes
 * Every animal should have a Name and eating type attribute
 * Every animal should be able to perform all basic commands from below
 */
public abstract class Animal {

    public Animal() {}

    public abstract String getName();

    public abstract void sayHello();

    public abstract void eatLeaves();

    public abstract void eatMeat();

    public abstract void performTrick();

    public abstract boolean knowsTrick();

    public abstract EatingType getEatingType();

}
