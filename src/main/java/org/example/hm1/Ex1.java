package org.example.hm1;
import java.util. *;
import java.util.Scanner;

/**
 * Задача 1
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите конечное число последовательности ");
        int n = sc.nextInt();
        int sum = 1;
        int count = 0;
        int p = 0;

        while (count < n) {
            p++;
            if (p % 2 != 0) {
                if (is_Prime(p)) {
                    sum += p;
                }
            }
            count++;
        }
        System.out.println("Сумма простых чисел =" + sum);
    }
    public static boolean is_Prime(int p) {
        for (int i = 3; i * i <= p; i += 2) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}



