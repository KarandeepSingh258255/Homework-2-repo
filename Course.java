public class Course {
    private Professor instructor;
    private CollegeStudent[] Liststudents;
    private String courseName;

    //set get


    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
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

    }
}






