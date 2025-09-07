package les34.task1;

public class FilterByAge implements Filter{
    @Override
    public boolean test(Student student) {
//        if (student.getAge() > 25) {
//            return true;
//        } else {
//            return false;
//        }

        return student.getAge() > 25;
    }
}
