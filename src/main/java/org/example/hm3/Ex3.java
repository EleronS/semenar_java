package org.example.hm3;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Ex3 {
    public static void main(String[] args) {
        //Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки .

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int[] arr1 = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(b.split(" ")).mapToInt(Integer::parseInt).toArray();

        String sum = " ";

        for(int i = 0; i < arr1.length;i++){
            for(int j = 0; j < arr2.length;j++) {
                while (arr1[i] >= 0 || arr2[j] >= 0) {
                if (arr1[i] == 1 & arr2[j] == 1) {
                        sum += "10";
                    }
                else if (arr1[i] == 0 & arr2[j] == 0) {
                        sum += "0";

                    } else if (arr1[i] == 0 & arr2[j] == 1 | arr1[i] == 1 & arr2[j] == 0) {
                        sum += "1";


                    } else {
                        sum += "0";
                    }break;

                }
                System.out.print(sum.trim());
            }
     }
   }
 }
