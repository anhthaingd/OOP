package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    public static int COUNT = 0;

    Scanner sc = new Scanner(System.in);
    public Student(String name) {
        this.id = COUNT++;
        this.name = name;
    }
    @Override
    public String toString () {
        return "Student[id: " + id + ", name: " + name
                +"]";
    }
}
