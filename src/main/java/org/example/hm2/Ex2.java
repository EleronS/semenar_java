package org.example.hm2;

import java.util.HashMap;
import java.util.Map;

/**
 *  Подсчитать количество искомого слова, через map
 *  (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Ex2 {
    public static void main(String[] args) {
        Map<Character, Integer> mpKey = new HashMap<>();
        mpKey.put('J',1);
        mpKey.put('A',1);
        mpKey.put('V',1);
        mpKey.put(' ',0);
        mpKey.put('P',0);
        mpKey.put('Y',0);
        mpKey.put('T',0);
        mpKey.put('H',0);
        mpKey.put('O',0);
        mpKey.put('N',0);




        String s = "JAVA JAVA PYTHON JAVA PHP JAVA JAVA";
        int count = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if(mpKey.get(s.charAt(i))>=mpKey.get(s.charAt(i+1))){
                count += mpKey.get(s.charAt(i));
            }else{
                count += 0;
            }

        }
        System.out.println(count/4);
    }
}




