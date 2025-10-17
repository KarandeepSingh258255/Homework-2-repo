public class Student extends Person {
    private String stu_id;
    private double GPA;

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    Student(String name, Boolean alive, int age, String SSN, String stu_id, double GPA) {
        super(name, alive, age, SSN);
        this.stu_id = stu_id;
        this.GPA = GPA;
    }

    Student() {
        super();
        String stu_id = "";
        double GPA = 0.0;
    }

    Student (Student other) {
        super(other);
        this.stu_id = other.stu_id;
        this.GPA = other.GPA;
    }

    //toString
    public String toString() {
        String s = "";
        s += "Student Information\n";
        s += "Student ID: " + stu_id;
        s += "\nGPA: ";
        return s;
    }


}
