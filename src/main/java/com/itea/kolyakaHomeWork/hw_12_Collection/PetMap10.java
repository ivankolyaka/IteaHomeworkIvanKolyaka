package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PetMap10 {

    public static void main(String[] args) {
        Pet pet1 = new Cat(1,"Chups", "catprop");
        Pet pet2 = new Dog(2,"Baita", "dogprop");
        Pet pet3 = new Parrot(1,"Popka", "popugprop");

        Map<String,Pet> petMap = new TreeMap<>();
        petMap.put("Chups",pet1);
        petMap.put("Baita",pet2);
        petMap.put("Popka",pet3);

        printPet(petMap);

     }

     public static void printPet(Map<String,Pet> petMap) {
        Set<String> petNameSet = petMap.keySet();
         for (String petName:petNameSet
              ) {
             System.out.println(petName);
         }
     }
}

class Pet{
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    int id;
    String name;

    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Cat extends Pet{
    String catProp;

    public Cat(int id, String name,String catProp) {
        super(id, name);
        this.catProp=catProp;
    }
}
class Dog extends Pet{
    String dogProp;
    public Dog(int id, String name, String dogProp) {
        super(id, name);
        this.dogProp=dogProp;
    }
}
class Parrot extends Pet{
    String parrotProp;
    public Parrot(int id, String name, String parrotProp) {
        super(id, name);
        this.parrotProp=parrotProp;
    }
}