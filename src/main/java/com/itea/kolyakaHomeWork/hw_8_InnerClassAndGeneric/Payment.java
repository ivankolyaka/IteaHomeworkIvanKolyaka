package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;
import java.util.Date;

public class Payment {
    int idPayment;
    Date datePayment;
    private class Product{
        int idProduct;
        String productName;
        double productPrice;
    }
    ArrayList<Product> productList;
}
