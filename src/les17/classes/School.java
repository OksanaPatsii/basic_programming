package les17.classes;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Ruslan", "Group #1", 4.5, 4.2, 4.7, true);
        System.out.println("Student: " + student1.name + ", Group: " + student1.group);


        student1.avgGrade = (student1.math + student1.english + student1.it) / 3;

        System.out.println("Notendurchschnitt des Studenten " + student1.name + " : " + student1.avgGrade);
    }
}
