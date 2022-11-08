package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
        List<Student> students = new ArrayList<>();
    public Exercise1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number student");
        int num = sc.nextInt();
        for (int i=0;i<num-3;i++) {
            System.out.println("Input name");
            String name = sc.next();
            Student st = new Student(name);
            students.add(st);
        }
        Student st1 = new Student("Thai");
        Student st2 = new Student("Thai");
        Student st3 = new Student("Thai");
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public void question1 () {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menuQ1();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Tong so phan tu cua students: " + students.size());
                    break;
                case 2:
                    System.out.println("Phan tu thu 4 cua students: " + students.get(3));
                    break;
                case 3:
                    System.out.println("Phan tu dau: " + students.get(0));
                    System.out.println("Phan tu cuoi: " + students.get(students.size()-1));
                    break;
                case 4:
                    System.out.println("Them phan tu vao vi tri dau");
                    Student st = new Student("Vi tri dau");
                    students.add(0,st);
                    printList();
                    break;
                case 5:
                    System.out.println("Them phan tu vao vi tri cuoi");
                    Student st1 = new Student("Vi tri cuoi");
                    students.add(students.size()-1,st1);
                    printList();
                    break;
                case 6:
                    for (int i = 0;i <students.size()/2;i++) {
                        Student tmp = students.get(i);
                        students.set(i,students.get(students.size()-1-i));
                        students
                    }
                case 13:
                    return;
                default:
            }
        }
    }
    public  void printList() {
        for(Student student : students) {
            System.out.println(student);
        }
    }
    public static void menuQ1() {
        System.out.println("1: In ra tong so phan tu cua students");
        System.out.println("2. Lay phan tu thu 4");
        System.out.println("3. In ra phan tu dau va cuoi");
        System.out.println("4. Them 1 phan tu vao vi tri dau");
        System.out.println("5. Them 1 phan tu vao cuoi");
        System.out.println("6. Dao nguoc vi tri cua students");
        System.out.println("7. Tim kiem student theo id");
        System.out.println("8. Tim kiem student theo name");
        System.out.println("9. In ra student co trung ten");
        System.out.println("10. Xoa name cua student co id = 2");
        System.out.println("11. Xoa student co id = 5");
        System.out.println("12. Add students vao 1 array khac");
        System.out.println("13. Thoat");
        System.out.println("Chon chuc nang: ");
    }
}
