package les23.home;

public class Student {
    private String name;
    private String group;
    private String idNumber;
    private int score;

    public Student(String name, String group, String idNumber) {
        this.name = name;
        this.group = group;
        this.idNumber = idNumber;
    }

    public Student(String name, String group, String idNumber, int score) {
        this.name = name;
        this.group = group;
        this.idNumber = idNumber;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", score=" + score +
                '}';
    }
}
