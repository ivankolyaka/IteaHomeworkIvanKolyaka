package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public class BelarusHen extends Hen{

    public BelarusHen(String breed) {
        super(breed);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя старна - Белорусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
