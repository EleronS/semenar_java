package org.example.cw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor

public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evaluations;
}
