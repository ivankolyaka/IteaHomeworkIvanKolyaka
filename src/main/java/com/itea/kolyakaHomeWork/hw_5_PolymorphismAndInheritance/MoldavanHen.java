package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public class MoldavanHen extends Hen{

    public MoldavanHen(String breed) {
        super(breed);
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя старна - Молдавия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
