package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap08 {
    public static void main(String[] args) {
        HashMap<String,Product> productHashMap = new HashMap<>();

        Product product1 = new Product(1,"toy1",5);
        Product product3= new Product(3,"toy3",3);
        Product product2 = new Product(2,"toy2",2);

        productHashMap.put("toy1",product1);
        productHashMap.put("toy3",product3);
        productHashMap.put("toy2",product2);

        Set<Map.Entry<String, Product>> entrySet =  productHashMap.entrySet();
        for (Map.Entry<String, Product> ent: entrySet
             ) {
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
    }
}

class Product{
    int id;
    String toyName;
    int toyPrice;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", toyName='" + toyName + '\'' +
                ", toyPrice=" + toyPrice +
                '}';
    }

    public Product(int id, String toyName, int toyPrice) {
        this.id = id;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
    }
}
