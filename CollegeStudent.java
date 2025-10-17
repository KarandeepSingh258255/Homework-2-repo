public class CollegeStudent extends Student{
    private String major;
    private String grade;

    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    CollegeStudent (String name, Boolean alive, int age, String SSN, String stu_id, double GPA, String major, String grade) {
        super(name, alive, age, SSN, stu_id, GPA);
        this.major = major;
        this.grade = grade;
    }

    CollegeStudent (CollegeStudent other) {
        this.major = other.major;
        this.grade = other.grade;
    }

    public String toString() {
        String s = "";
        s += "College Information:\n";
        s += "\nMajor: " + major;
        s += "\nGrade: " + grade;
        return s;
    }
}
