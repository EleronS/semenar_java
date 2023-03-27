package org.example.hw1;

import org.example.hw1.model.Base;
import org.example.hw1.model.Laptop;
import org.example.hw1.model.StartProgram;

import java.util.HashSet;
import java.util.Set;


/**
 *  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 *  Реализовать в java.
 * • Создать множество ноутбуков.
 * • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 *  и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
 * фильтрации можно также в Map.
 * • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Ex1 {
    private static Set<Laptop> laptopSet;

    public static void main(String[] args) {


        Base operation = new Base(laptopSet);
        operation.start();



    }

}

