package org.example.cw4;

import org.example.cw3.model.Coub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Coub coub1 = new Coub("Зеленый", 13, "Деревянный");
        Coub coub2 = new Coub("Желтый", 73, "Металлический");
        Coub coub3 = new Coub("Красный", 23, "Картонный");
        Coub coub4 = new Coub("Желтый", 3, "Пластиковый");
        Coub coub5 = new Coub("Красный", 23, "Картонный");
        Coub coub6 = new Coub("Желтый", 3, "Пластиковый");

        List<Coub> listCoub = new ArrayList<>();
        listCoub.add(coub1);
        listCoub.add(coub2);
        listCoub.add(coub3);
        listCoub.add(coub4);
        listCoub.add(coub5);
        listCoub.add(coub6);

        System.out.println("Коллекция "+ listCoub.size());

        System.out.println("Уникальная коллекция :" + unicumeCollection(listCoub).size());
    }

    private static Collection<Coub> unicumeCollection(List<Coub> listCoub) {
        return new HashSet<>(listCoub);
    }
}
