package les19.studentsSimple;

import les17.Library.UserInput;

public class StudentDemoSimple {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();

        System.out.println("Geben Sie die Daten für den ersten Studenten ein.");
        String surname = userInput.getUserText("Geben Sie den Nachnamen des Studenten ein:");
        String name = userInput.getUserText("Geben Sie den Namen des Studenten ein:");
        String idNumber = userInput.getUserText("Geben Sie die Matrikelnummer des Studierenden ein:");
        String group = userInput.getUserText("Geben Sie die Gruppennummer des Studierenden ein:");

        Student student1 = new Student(surname, name, idNumber, group);

        System.out.println();
        System.out.println("Geben Sie die Daten für den zweiten Studenten ein.");
         surname = userInput.getUserText("Geben Sie den Nachnamen des Studenten ein:");
         name = userInput.getUserText("Geben Sie den Namen des Studenten ein:");
         idNumber = userInput.getUserText("Geben Sie die Matrikelnummer des Studierenden ein:");
         group = userInput.getUserText("Geben Sie die Gruppennummer des Studierenden ein:");

        Student student2 = new Student(surname, name, idNumber, group);

        System.out.println();
        System.out.println("Geben Sie die Daten für den dritten Studenten ein.");
         surname = userInput.getUserText("Geben Sie den Nachnamen des Studenten ein:");
         name = userInput.getUserText("Geben Sie den Namen des Studenten ein:");
         idNumber = userInput.getUserText("Geben Sie die Matrikelnummer des Studierenden ein:");
         group = userInput.getUserText("Geben Sie die Gruppennummer des Studierenden ein:");

        Student student3 = new Student(surname, name, idNumber, group);



        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();


        if ((student1.getSurname().equals(student2.getSurname()))
            && (student1.getName().equals(student2.getName()))) {
            System.out.println("Die Studenten sind gleich.");
        }

        if (student1.equals(student2)) {
            System.out.println("Die Studenten sind gleich.");
        }



    }
}
