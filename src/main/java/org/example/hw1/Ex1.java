package org.example.hw1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 *  Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 */
public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> mpStr = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        for (String s : str.toLowerCase().replaceAll
                ("\\p{Punct}", "").split(" ")) {
            mpStr.putIfAbsent(s, 0);
            mpStr.put(s, mpStr.get(s) + 1);
            //System.out.println(s + mpStr);
        }
        for (var t : mpStr.entrySet()) {
            System.out.println("слово * " + t.getKey() +" *  " + t.getValue() + " раз");
        }
    }
}



