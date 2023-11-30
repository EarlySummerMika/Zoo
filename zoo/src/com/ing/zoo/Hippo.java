package com.ing.zoo;

public class Hippo {
    private String name;
    private String helloText;
    private String eatText;

    private String eatsFoodType;

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
