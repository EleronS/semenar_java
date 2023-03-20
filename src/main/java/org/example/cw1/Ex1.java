package org.example.cw1;

import java.util.HashMap;
import java.util.Map;

/**
 * ⦁	Посчитать количество вхождений каждого символа в текст.
 */
public class Ex1 {
    public static void main(String[] args) {
        Map<Character,Integer> mpCh = new HashMap<>();
        String str ="ddeezxc eeww ddrrdsdffcx";
        for (int i = 0; i < str.length(); i++) {
            mpCh.putIfAbsent(str.charAt(i),1);
            mpCh.put(str.charAt(i),1);
//            if(!mpCh.containsKey(str.charAt(i))){
//                mpCh.put(str.charAt(i),1);
//            }else{
//                mpCh.put(str.charAt(i),mpCh.get(str.charAt(i))+1);
//            }

        }
        for(var en:mpCh.entrySet()){
            System.out.println(en.getKey()+ "  встретился - " +en.getValue()+ " раз");
        }
    }
}