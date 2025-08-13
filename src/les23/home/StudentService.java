package les23.home;

import les17.Library.UserInput;

public class StudentService {
    public Student registerNewStudent(){
        UserInput userInput = new UserInput();

        System.out.println("Geben Sie die Daten des neuen Studenten ein");

        String name = userInput.getUserText("Geben Sie den Namen des neuen Studenten ein");
        String group = userInput.getUserText("Geben Sie der Gruppe des neuen Studenten ein");
        String idNumber = userInput.getUserText("Matrikelnummer eingeben");


        return new Student(name, group, idNumber);
    }

    public void updateStudentScore(Student student) {
        UserInput userInput = new UserInput();
        int score = userInput.getUserInteger("Durchschnittsnote eingeben");
        student.setScore(score);
    }

    public void createdStudent(Student student){
        System.out.println("Studentin " + student + " wurde erfolgreich registriert");
    }
}
