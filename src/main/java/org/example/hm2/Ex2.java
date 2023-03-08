package org.example.hm2;

import javax.swing.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = scanner.nextInt();
        while(a != 0){
            int b = a;
            a = scanner.nextInt();
            if(a != 0)
                if (b > 0 && a < 0) {
                    sum += b;
                }
            }System.out.println(sum);

    }
}
