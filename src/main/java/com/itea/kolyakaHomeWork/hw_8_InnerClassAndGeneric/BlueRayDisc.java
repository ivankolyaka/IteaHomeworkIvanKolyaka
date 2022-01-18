package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;

public class BlueRayDisc {
    class Catalog{
        int idCatalog;
        String nameCatalog;
        ArrayList<SubCatalog> subCatalogArrayList;
    }
    class SubCatalog{
        int idSubCatalog;
        String nameSubCatalog;
        ArrayList<Record> recordArrayList;
    }
    class Record{
        int idRecord;
        String nameRecord;
    }
    ArrayList<Catalog> catalogArrayList;
}
