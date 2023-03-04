package org.example.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Найти количество положительных чисел, после которых следует отрицательное число.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int a = scanner.nextInt();
        for (int i = 1; i < n; i++){
            int b = scanner.nextInt();
            if (a > 0 && b < 0){
                k++;
            }
            a=b;
        }
        System.out.println("k ="+ k);
        scanner.close();
    }
}
