package org.example.cw4;

import org.example.cw4.model.Celsius;
import org.example.cw4.model.Faringate;
import org.example.cw4.model.Kelvin;

public class Ex4 {
    public static void main(String[] args) {
        Double t = 36.6;
        Double tFar = new Faringate().convert(t);
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(t);
        System.out.println(tKel);
        Double tCel = new Celsius().convert(t);
        System.out.println(tCel);
    }
}
