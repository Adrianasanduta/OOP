package com.company;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private int foundationYear;
    private List<Student> studentList;

    public University(String name, int foundationYear, List<Student> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.studentList = students;
    }
    String getName() {
        return this.name;
    }

    double getAverage() {
        double sum = 0;
        int studentsNr = this.studentList.size();
        for (int i = 0; i < studentsNr; i++) {
            Student currentStudent = this.studentList.get(i);
            sum = sum + currentStudent.getMark();
        }
        double average = sum / studentsNr;
        return average;
    }
}
class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() {

        return this.mark;
    }
}


public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Adriana", 20, 10);
        Student student2 = new Student("Sandrinia", 17, 9.9);
        List<Student> utmStudents = new ArrayList<Student>();
        utmStudents.add(student1);
        utmStudents.add(student2);
        University utm = new University("UTM", 1999, utmStudents);


        Student student3 = new Student("Ilona", 18, 8);
        Student student4 = new Student("Madalina", 8, 7.5);
        List<Student> usmStudents = new ArrayList<Student>();
        usmStudents.add(student3);
        usmStudents.add(student4);
        University usm = new University("USM", 2000, usmStudents);


        Student student5 = new Student("Andrei", 33, 5);
        Student student6 = new Student("Inga", 23, 9.5);
        List<Student> ulimStudents = new ArrayList<Student>();
        ulimStudents.add(student5);
        ulimStudents.add(student6);
        University ulim = new University("ULIM", 1964, ulimStudents);



        System.out.println("Average media for "+utm.getName()+" is " + utm.getAverage());
        System.out.println("Average media for "+usm.getName()+" is " + usm.getAverage());
        System.out.println("Average media for "+ulim.getName()+" is " + ulim.getAverage());
        double universitiesAvg = (utm.getAverage() + usm.getAverage() + ulim.getAverage()) / 3;
        System.out.println("Average between universities is " + universitiesAvg);
    }
}
