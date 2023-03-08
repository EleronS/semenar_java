package org.example.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //последовательность из N чисел.найти сумму чисел оканчивающихся на 5 перед
        //которыми идет четное число.
        System.out.println(sum5());

    }
    public static int sum5(){
        Scanner scaner = new Scanner(System.in);
        int sum = 0;
        int n = scaner.nextInt();
        int lastNum = scaner.nextInt();
        for(int i = 0; i < n-1;i++){
            int curentNum = scaner.nextInt();
            if(curentNum % 10 == 5 && lastNum % 2 == 0){
                sum = curentNum;
            }
            lastNum = curentNum;
        }

        return sum;

    }
}
