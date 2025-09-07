package les34.task1;

public class FilterByDegreeAndRate implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getDegree().equals(Degree.BACHELOR) && student.getAverageRate() > 4;
    }
}
