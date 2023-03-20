package org.example.cw2;

import java.util.HashMap;
import java.util.Map;

/**
 * ⦁	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Ex2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,1};
        System.out.println(searhDublicate(arr));
    }

    private static boolean searhDublicate(int[] arr) {
        Map<Integer,Integer> sd = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(sd.containsKey(arr[i])){
                return false;
            }else
                sd.put(arr[i],1);
            }
        return true;
    }
}
