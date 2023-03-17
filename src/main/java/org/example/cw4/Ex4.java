package org.example.cw4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * построить однонаправленный список целых чисел. удалить отрицательные элементы списка.
 */
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> someList = new LinkedList<>(Arrays.asList(-1,2,3,-4,5,6,7,-8,9));
        System.out.println(solutionM(someList));
        System.out.println(solutionRM(someList));
    }

    /**
     * метод удаления отрицательных элементов
     * @param someList исходный список
     * @return измененный список
     */
    private static List<Integer> solutionM(List<Integer> someList) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) < 0) {
                someList.remove(i);
                i--;
            }
        }
        return someList;
    }

    /**
     * метод удаления отрицательных элементов проходом с конца списка
     * @param someList исходный список
     * @return измененный список
     */
    private static List<Integer> solutionRM(List<Integer> someList) {
        for (int i = someList.size()-1;i>=0; i--) {
            if(someList.get(i)<0){
                someList.remove(i);
            }

        }

        return someList;
    }
}
