package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;


import java.util.ArrayList;
import java.util.Date;


public class Catalog {
    int idCatalog;
    class Book{
        int idBook;
        String bookInfo;
    }
    class BookLending{
        int idLending;
        Book book;
        Date dateLending;
    }
    ArrayList<BookLending> bookLendingHistory;
}
