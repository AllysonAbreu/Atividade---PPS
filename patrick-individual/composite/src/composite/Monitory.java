package composite;

import java.util.ArrayList;

public class Monitory extends SignedStudent {
    private String subject;
    private ArrayList<Student> studentsList = new ArrayList<Student>();

    public void add(Student newStudent) {
        studentsList.add(newStudent);
    }

    public void remove(Student removedStudent) {
        studentsList.remove(removedStudent);
    }

    public Monitory(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
