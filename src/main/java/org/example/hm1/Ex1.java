package org.example.hm1;

import org.example.hm1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        Product product1 = new Product("высший уровень", 515, "third");
        Product product2 = new Product("Наивысший", 5, "first");
        Product product3 = new Product("Вообще не але", 38, "second");
        Product product4 = new Product("Самый высший", 1110, "second");
        Product product5 = new Product("Такое себе...", 87, "first");
        Product product6 = new Product("Всевышний!", 390, "first");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        String hight = "высший";
        String f1 = "first";
        String s2 = "second";
        int maxPrice = 0;

        for(Product product : productList){
            if(product.getGrade().contains(f1) ||  product.getGrade().contains(s2)){
                if(product.getName().contains(hight)) {
                    if (product.getPrice() > maxPrice) {
                        maxPrice = 0;
                        maxPrice += product.getPrice().intValue();
                    }

                }
            }
            
        }
        System.out.println("Наибольшая цена: = " + maxPrice);
    }
}
