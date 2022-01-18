package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public class UkrainianHen extends Hen{

    public UkrainianHen(String breed) {
        super(breed);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя старна - Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
