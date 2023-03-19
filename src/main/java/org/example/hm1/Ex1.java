package org.example.hm1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList).
 */
public class Ex1 {
    public static void main(String[] args) {
        Deque<Integer> numList = new LinkedList<>();
        System.out.println("original");
        for (int i = 1; i < 5; i++) {
            numList.add(i);
            System.out.print(i);
        }
        System.out.println("\nmodding");
        for (int j = numList.size(); j >=1 ; j--) {
            numList.addFirst(j);
            numList.remove(j);
            System.out.print(j);

        }

    }
}
