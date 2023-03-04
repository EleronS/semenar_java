package org.example.cw;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
// найти раздницу произведения и суммы цифр натурального числа.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("result : %d",nameProduct(n));

    }
    public static int nameProduct(int n){
        int sum=0, multi=1;
        while(n!=0){
            sum += n%10;
            multi *= n%10;
            n/=10;
        }
        return multi - sum;

    }
}
