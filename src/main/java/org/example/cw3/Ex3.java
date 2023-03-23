package org.example.cw3;

import java.util.*;

/**
 * Найти пересечение в массивах и указать их общее количество.
 */
public class Ex3 {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>(Arrays.asList("dfg","drg","rdf","fdd"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("pgh","drg","frg"));

        Set<String> crossWord = new HashSet<>(arr1);
        List<String> arrList = new ArrayList<>(arr1);
        arrList.retainAll(arr2);

        Map<String,Integer> count2 = new HashMap<>();//map

        for (String item: crossWord){
            int count = 0;
            for(String allitem : arrList){
                if(item.equals(allitem)){
                    count++;
                    Integer itemCount = count2.get(item);//map
                    if(itemCount == null) itemCount = 0;//map
                    itemCount++;//map
                    count2.put(item, itemCount);//map
                }

            }
            System.out.println(item+ " " +count);

        }
        System.out.println(count2);

    }
}
