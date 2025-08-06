package les19.studentsSimple;

import java.util.Objects;

public class Student {
    private String surname;
    private String name;
    private String idNumber;
    private String group;

    public Student(String surname, String name, String idNumber, String group) {
        this.surname = surname;
        this.name = name;
        this.idNumber = idNumber;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getGroup() {
        return group;
    }


    public void printStudentInfo() {
        System.out.println("Student: " + surname + " " + name + ", Gruppe: " + group);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(surname, student.surname) && Objects.equals(name, student.name) && Objects.equals(idNumber, student.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, idNumber);
    }
}
