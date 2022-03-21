package main;

import composite.Classroom;
import composite.Monitory;
import composite.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String []args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Patrick", 1);
        Student student2 = new Student("Allyson", 2);
        Student student3 = new Student("Clara", 3);
        Student student4 = new Student("Anderson", 4);

        Classroom classroom1 = new Classroom("2022-A", students);
        classroom1.add(student1);
        classroom1.add(student2);
        classroom1.add(student3);
        classroom1.add(student4);

        System.out.println("Students from class " + classroom1.getIdClassroom());
        for (Student student : classroom1.getStudentsList()) {
            System.out.println("Registration: "+student.getRegistrationId()+" - "+"Name: "+student.getName());
        }

        classroom1.remove(student2);
        System.out.println("Students from class " + classroom1.getIdClassroom());
        for (Student student : classroom1.getStudentsList()) {
            System.out.println("Registration: "+student.getRegistrationId()+" - "+"Name: "+student.getName());
        }

        Monitory monitory1 = new Monitory("Web Development");
        monitory1.add(student2);
        monitory1.add(student4);
        System.out.println("Students from monitory " + monitory1.getSubject());
        for (Student student : monitory1.getStudentsList()) {
            System.out.println("Registration: "+student.getRegistrationId()+" - "+"Name: "+student.getName());
        }
    }
}
