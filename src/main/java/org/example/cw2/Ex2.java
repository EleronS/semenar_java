package org.example.cw2;

import org.example.cw2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        Student student1 = new Student("Ivanova", 2, 234, List.of(3,4,5));
        Student student2 = new Student("Smirnov", 3, 250, List.of(3,4,6));
        Student student3 = new Student("Sidorov", 2, 200, List.of(3,4,7));
        Student student4 = new Student("Popov", 3, 238, List.of(3,4,8));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        for (Student el : listStudent){
            double sum = 0;
            for (double es : el.getEvaluations()){
                sum += es;
            }
            if(el.getSurname().endsWith("ova") && sum % 2 ==0){
                System.out.println(el.getMoney());
            }
        }
    }
}
