package com.ing.zoo;

import java.util.Random;

public class Tiger {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    private String eatsFoodType;

    public Tiger()
    {
    }

    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performTrick()
    {
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
}
