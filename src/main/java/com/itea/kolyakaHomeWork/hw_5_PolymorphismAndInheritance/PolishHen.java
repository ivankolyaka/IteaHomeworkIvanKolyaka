package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public class PolishHen extends Hen{

    public PolishHen(String breed) {
        super(breed);
    }

    @Override
    int getCountOfEggsPerMonth() {
         return 130;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя старна - Польша. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
