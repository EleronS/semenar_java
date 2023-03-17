package org.example.cw1;

import java.util.LinkedList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        for (int i = 0; i < 6 ; i++) {
            integerList.add(i);
        }
        System.out.println("peek = "+integerList.peek());
        System.out.println(integerList);
        System.out.println("pop ="+integerList.pop());
        System.out.println(integerList);
        integerList.addFirst(3);
        System.out.println("add first ="+integerList);
        integerList.addLast(7);
        System.out.println("add last ="+integerList);
        integerList.remove(3);
        System.out.println("remove ="+integerList);
        System.out.println("contains ="+integerList.contains(2));
    }
}
