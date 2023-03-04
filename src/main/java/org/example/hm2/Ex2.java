package org.example.hm2;

import org.example.hm1.model.Product;
import org.example.hm2.model.Commodity;

import java.util.*;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {

        Commodity com1 = new Commodity("oranges", "egipt", 123.5, 11, "first");
        Commodity com2 = new Commodity("bananas", "equador", 400.0, 45, "premium");
        Commodity com3 = new Commodity("grape", "italy", 100.5, 143, "hight");
        Commodity com4 = new Commodity("apple", "france", 900.4, 60, "lux");
        Commodity com5 = new Commodity("finic", "iran", 500.5, 11, "first");
        Commodity com6 = new Commodity("lemon", "iordan", 450.5, 70, "first");

        List<Commodity> comList = new ArrayList<>();
        comList.add(com1);
        comList.add(com2);
        comList.add(com3);
        comList.add(com4);
        comList.add(com5);
        comList.add(com6);

        Scanner scanner = new Scanner(System.in);
        String searchVariety = scanner.nextLine();
        int minPrice = com1.getPrice();
        List<String> names = new ArrayList<>();


        for(Commodity com : comList){
            if(com.getVariety().contains(searchVariety)){
                if (com.getPrice() <= minPrice) {
                    minPrice = 0;
                    minPrice += com.getPrice();
                    names.add(com.getName());

                }
            }

        }System.out.println("Название товара " + searchVariety + " сорта: " + names);


    }
}






        //System.out.println("Название товара " + searchVariety + " сорта: " + minPrice);

