import java.util.List;

public class Course {
    private Professor instructor;
    private CollegeStudent[] Liststudents;
    private String courseName;

    //set get


    public Professor getInstructor() {
        Professor copy = new Professor();
        return copy;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = new Professor();
    }

    public Student[] getListstudents() {
        Student[] copy = new Student[Liststudents.length];
        for (int i = 0; i < Liststudents.length; i++) {
            copy[i] = Liststudents[i];
        }
        return copy;
    }

    public void setListstudents(CollegeStudent[] liststudents) {
        this.Liststudents = new CollegeStudent[Liststudents.length];
        for (int i = 0; i < liststudents.length; i++){
            Liststudents[i] = new CollegeStudent(Liststudents[i]);
        }
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    // no arg

    Course(){
        this.courseName = "";
        this.Liststudents = new CollegeStudent[0];
        for (int i = 0; i < Liststudents.length; i++) {
            Liststudents[i] = new CollegeStudent(Liststudents[i]);
        }
        this.instructor = new Professor();
    }

    //fully-loaded

    Course(Professor instructor, CollegeStudent[] Liststudents, String courseName){
        this.instructor = new Professor();
        this.courseName = courseName;
        this.Liststudents = new CollegeStudent[0];
        for (int i = 0; i < Liststudents.length; i++){
            Liststudents[i] = new CollegeStudent(Liststudents[i]);
        }
    }

    @Override
    public String toString() {
        String s = "";
        s += "Course: " + this.courseName;
        s += "\nProfessor: " + this.instructor;
        s += "\nCollege Student Info: ";
        for (int i = 0; i < Liststudents.length; i++){
            s += this.Liststudents[i].toString() + "\n";
        }
        return s;
    }
}







