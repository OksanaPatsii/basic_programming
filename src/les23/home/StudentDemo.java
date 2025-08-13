package les23.home;

public class StudentDemo {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        Student student1 = studentService.registerNewStudent();

        studentService.createdStudent(student1);

        studentService.updateStudentScore(student1);
        studentService.createdStudent(student1);
    }
}
