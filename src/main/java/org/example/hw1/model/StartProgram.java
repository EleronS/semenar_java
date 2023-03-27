package org.example.hw1.model;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StartProgram{

    public void startProg () {
        Set< Laptop > set = new HashSet<>();
        set.add(new Laptop(1,"ASUS" , 500, 8, "Windows10","black"));
        set.add(new Laptop(2,"LENOVO" , 750, 8, "Linux","white"));
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                " * 1 - ОЗУ\n" +
                " * 2 - Объем ЖД\n" +
                " * 3 - Операционная система\n" +
                " * 4 - Цвет \n");

        while (true) {
            int put = sc.nextInt();
            if (put > 0 && put < 5) {
                switch (put) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                }System.out.println("Выберите операцию!");


            } else {
                System.out.println("Попробуйте подходящее значение!");
            }
        }*/



    }


}
