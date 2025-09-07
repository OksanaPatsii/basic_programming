package les34.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Vasiliy", 25, 5, 4.1, Degree.BACHELOR));
        students.add(new Student("Oleksandra", 31, 1, 4.34, Degree.MASTER));
        students.add(new Student("Petr", 22, 2, 4.65, Degree.BACHELOR));
        students.add(new Student("Ivan", 27, 4, 3.98, Degree.BACHELOR));
        students.add(new Student("Olha", 21, 3, 4.23, Degree.BACHELOR));
        students.add(new Student("Artem", 29, 1, 3.74, Degree.MASTER));
        students.add(new Student("Nikolay", 34, 2, 4.7, Degree.MASTER));
        students.add(new Student("Anton", 23, 3, 4.56, Degree.BACHELOR));

        System.out.println("Liste aller Studierenden");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Studenten über 25 Jahre:");
        StudentUtils.printFilteredStudent(students, new FilterByAge());


        System.out.println("Bachelor mit einer Note über 4:");
        StudentUtils.printFilteredStudent(students, new FilterByDegreeAndRate());

        System.out.println("Alle Studienanfänger");
        StudentUtils.printFilteredStudent(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() == 1;
            }
        });

        System.out.println("Schüler mit Namen, die mit „a“ beginnen");
        StudentUtils.printFilteredStudent(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getName().startsWith("A");
            }
        });

        System.out.println("Schüler mit ungeradem Alter:");
        StudentUtils.printFilteredStudent(students, x -> x.getAge() % 2 !=0);

        System.out.println("Alle Schüler sind Meister");
        StudentUtils.printFilteredStudent(students, x -> x.getDegree().equals(Degree.MASTER));

        System.out.println("Bachelor-Abschluss 1, 2 und 3 Jahre");
        StudentUtils.printFilteredStudent(students, x -> x.getDegree().equals(Degree.BACHELOR) && x.getCourse() < 4);
    }
}
