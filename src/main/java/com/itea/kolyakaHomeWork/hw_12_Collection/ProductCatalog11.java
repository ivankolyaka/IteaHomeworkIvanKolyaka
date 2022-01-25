package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ProductCatalog11 {

    public static void main(String[] args) {
        Product product1 = new Product(1,"prod1",5);
        Product product3= new Product(3,"prod3",33);
        Product product2 = new Product(2,"prod2",2);

        Comparator productComparator = new ProductPriceComparator();//ProductRatingComparator ProductPriceComparator ProductNameComparator
        TreeSet<Product> productList = new TreeSet<>(productComparator);
        productList.add(product1);
        productList.add(product3);
        productList.add(product2);

        System.out.println(productList);
    }
}


class ProductPriceComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.toyPrice- o2.toyPrice ;
    }
}

class ProductRatingComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.id- o2.id ;
    }
}

class ProductNameComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.toyName.compareToIgnoreCase(o2.toyName);
    }
}
