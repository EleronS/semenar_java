package org.example.hm2;

import java.util.Deque;
import java.util.LinkedList;


/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите,
 * допустима ли входная строка.'['']'
 * Входная строка действительна, если:
 * Открытые скобки должны быть закрыты однотипными скобками.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 * примеры:
 * 1 s = "()"          true
 * 2 s = "()[]{}"      true
 * 3 s = "(]"          false
 */
public class Ex2 {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("1  " + specSimbols(s1));
        System.out.println("2  " + specSimbols(s2));
        System.out.println("3  " + specSimbols(s3));

    }


    public static boolean specSimbols(String s) {
        Deque<Character> specList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            System.out.print(x);
            if (x == '{' || x == '(' || x == '[') {
                specList.push(x);
            } else {
                if (specList.isEmpty())
                    return false;
                else if (!isColl(specList.peek(), x))
                    return false;
                else
                    specList.pop();

            }
        }
        return specList.isEmpty();
    }

    /**
     *
     * @param y значение позиции прохода
     * @param z значение следующей позиции по проходу
     * @return результат валидности совпадений
     */
        public static boolean isColl ( char y, char z){
            return y == '(' && z == ')' || y == '[' && z == ']' || y == '{' && z == '}';
        }
    }



