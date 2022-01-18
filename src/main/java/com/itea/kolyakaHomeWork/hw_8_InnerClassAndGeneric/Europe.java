package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;
import java.util.Date;

public class Europe {

    class Сountry {
        int idСountry;
        String countryInfo;
    }
    class CountryDivision {
        int idDivision;
        Сountry country;
        Date dateDivision;
    }
    ArrayList<CountryDivision> countryDivisionHistory;
}