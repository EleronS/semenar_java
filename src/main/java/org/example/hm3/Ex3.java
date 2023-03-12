package org.example.hm3;

/**
 * Задача 3
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Ex3 {
    public static void main(String[] args) {
    int []arr = {11, -2, 44, 3, -3, -66, 4, -2};
    int sumDoub = 0;
 System.out.println("изначальный массив ");
     for(int i = 0; i < arr.length;i++){
        if(arr[i] > 9 || arr[i] < -9){
            sumDoub += i;
        }System.out.print(" " +arr[i]);
    }
     System.out.println(" ");
     System.out.println("измененный массив ");
     for(int i = 0; i < arr.length;i++){
        if(arr[i] < 0){
            arr[i] = sumDoub;
        }System.out.print(" " +arr[i]);

    }

}

}

