package com.itea.kolyakaHomeWork.hw_5_PolymorphismAndInheritance;

public class HenFactory {
    public static void main(String[] args) {
        UkrainianHen ukrHen  = new UkrainianHen("украинская курица");
        BelarusHen belHen = new BelarusHen("белорусская курица");
        MoldavanHen molHen = new MoldavanHen("молдавская курица");
        PolishHen polHen = new PolishHen("польская курица");

        System.out.println(ukrHen.getDescription());
        System.out.println(ukrHen.getHenBreed());

        System.out.println(belHen.getDescription());
        System.out.println(belHen.getHenBreed());

        System.out.println(molHen.getDescription());
        System.out.println(molHen.getHenBreed());

        System.out.println(polHen.getDescription());
        System.out.println(polHen.getHenBreed());

    }
}
