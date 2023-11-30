package com.ing.zoo;

import java.util.Random;

public class Zebra {
    private String name;
    private String helloText;
    private String eatText;

    private String trick;

    private String eatsFoodType;

    public Zebra()
    {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    public void setName(String name) {
        this.name = name;
    }
}
