package org.example.cw1;

import org.example.cw1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Items items = new Items("ddd", "vvv", 3.0);
        Items items1 = new Items("ddd1", "vvv1", 3.1);
        Items items2 = new Items("ddd2", "vvv2", 3.2);
        Items items3 = new Items("ddd3", "vvv3", 3.3);

        List<Items> itemList = new ArrayList<>();
        itemList.add(items);
        itemList.add(items1);
        itemList.add(items2);
        itemList.add(items3);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>();

        for(int i =0;i < itemList.size();i++){
            if(itemList.get(i).getName().equals(searchName)){
                sumVolume+=itemList.get(i).getVolume();
                country.add(itemList.get(i).getCountry());
            }
        }

        System.out.println("sum = " + sumVolume);
        System.out.println("country: " +country);

    }
}
