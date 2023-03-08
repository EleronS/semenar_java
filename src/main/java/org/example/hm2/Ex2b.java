package org.example.hm2;

public class Ex2b {
    public static void main(String[] args) {
        //Second realization Ex2
        int[]arr = {-2, 3, 5, -2, 5, 3, -4, 0, 1, -1};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]> 0 && arr[i+1] < 0) {
                sum += arr[i];


            } else if (arr[i] == 0) {
                break;

            }

        }
        System.out.println("sum ="+ sum);
    }
}
