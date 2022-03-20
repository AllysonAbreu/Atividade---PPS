package composite;

import java.util.ArrayList;

public class Student{
    private String name;
    private int registrationId;

    public Student(String name, int registrationId) {
        this.name = name;
        this.registrationId = registrationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
}
