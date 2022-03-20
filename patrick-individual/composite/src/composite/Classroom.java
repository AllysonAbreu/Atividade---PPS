package composite;

import java.util.ArrayList;

public class Classroom extends SignedStudent {
    private String idClassroom;
    private ArrayList<Student> studentsList;

    public Classroom(String idClassroom, ArrayList<Student> studentsList) {
        this.idClassroom = idClassroom;
        this.studentsList = studentsList;
    }

    public void add(Student newStudent) {
        studentsList.add(newStudent);
    }

    public void remove(Student removedStudent) {
        studentsList.remove(removedStudent);
    }

    public String getIdClassroom() {
        return idClassroom;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }
}
