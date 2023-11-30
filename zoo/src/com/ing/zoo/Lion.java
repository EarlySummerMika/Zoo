package com.ing.zoo;

public class Lion {
    private String name;
    private String helloText;
    private String eatText;

    private String eatsFoodType;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }

    public void setName(String name){
        this.name = name;
    }

}
