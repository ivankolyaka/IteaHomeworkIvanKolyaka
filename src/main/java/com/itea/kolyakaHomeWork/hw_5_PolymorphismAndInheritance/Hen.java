package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public abstract class Hen {
    private String henBreed;
    abstract int getCountOfEggsPerMonth();

    public Hen(String breed)
    {
        this.henBreed= breed;
    }

    String getDescription(){
        return  "Я курица";
    }

    public String getHenBreed ()
    {
        return henBreed;
    }
}