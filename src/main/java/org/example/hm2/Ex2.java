package org.example.hm2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Задача 2
 *  Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        new Ex2().execute();
    }
        private void execute() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("Введите количество элементов последовательности: ");
        int N = Integer.parseInt(reader.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; ++i) {
            System.out.println("Введите " + i + " элемент: ");
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Последовательность: " + Arrays.toString(array));
        String res = isIncreasing(array) ? "является" : "не является";
        System.out.println("Последовательность " + res + " возрастающей");
    }
        catch(IOException ignored){}

}

         private boolean isIncreasing(int[] arr) {
    for (int i = 1; i < arr.length; i++)
        if (arr[i] <= arr[i-1]) return false;
    return true;
}

}
