package org.example.cw1;

import java.util.*;

/**
 * Дан массив чисел. Посчитать процент уникальных чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,1));
        Set<Integer> set = new HashSet<>(array);
        double pr = set.size()*100/ array.size();
        System.out.println("pr ="+pr);
    }
}
