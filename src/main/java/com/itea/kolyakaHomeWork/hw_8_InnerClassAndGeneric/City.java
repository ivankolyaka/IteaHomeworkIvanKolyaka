package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;

public class City {
    int idCity;
    enum TypeSection {STREET,SQUARE,PROSPECT}
    Section section;

    class Section{
        TypeSection typeSection;
        String sectionName;
        int sectionNumber;
    }
    City(){
        section = new Section();
    }

    ArrayList<Section> sectionList = new ArrayList<>();

    public static void main(String[] args) {
        City city = new City();
        city.idCity=101;

        city.section.sectionNumber=5;
        city.section.typeSection = TypeSection.SQUARE;
        city.section.sectionName = "lva tolstogo";
        city.sectionList.add(city.section);

        city.section.sectionNumber=25;
        city.section.typeSection = TypeSection.PROSPECT;
        city.section.sectionName = "Peremogy";
        city.sectionList.add(city.section);

        System.out.println(city.toString());//надо бы переопределить
    }
}


