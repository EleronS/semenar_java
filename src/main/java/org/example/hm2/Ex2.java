package org.example.hm2;

import javax.swing.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует отрицательное число.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a != 0 || b != 0) {

                if (b < 0) {
                    sum += a;
                }
            }
            else{
                break;
            }


        }System.out.println(sum);

    }
}
