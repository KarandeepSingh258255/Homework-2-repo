public class Course {
    private Professor instructor;
    private CollegeStudent[] Liststudents;
    private String courseName;

    public Course() {
        this.instructor = new Professor();
        this.courseName = "";
        this.Liststudents = new CollegeStudent[0];
    }

    public Course(Course other) {
        if (other == null) throw new IllegalArgumentException("other is null");
        this.instructor = new Professor(other.instructor);
        this.courseName = other.courseName;
        CollegeStudent[] src = (other.Liststudents == null) ? new CollegeStudent[0] : other.Liststudents;
        this.Liststudents = new CollegeStudent[src.length];
        for (int i = 0; i < src.length; i++) {
            this.Liststudents[i] = new CollegeStudent(src[i]);
        }
    }

    public Course(Professor instructor, CollegeStudent[] Liststudents, String courseName) {
        this.instructor = new Professor(instructor);
        this.courseName = courseName;
        CollegeStudent[] src = (Liststudents == null) ? new CollegeStudent[0] : Liststudents;
        this.Liststudents = new CollegeStudent[src.length];
        for (int i = 0; i < src.length; i++) {
            this.Liststudents[i] = new CollegeStudent(src[i]);
        }
    }

    public Professor getInstructor() { return new Professor(instructor); }
    public void setInstructor(Professor instructor) { this.instructor = new Professor(instructor); }

    public CollegeStudent[] getListstudents() {
        CollegeStudent[] copy = new CollegeStudent[Liststudents.length];
        for (int i = 0; i < Liststudents.length; i++) copy[i] = new CollegeStudent(Liststudents[i]);
        return copy;
    }

    public void setListstudent(CollegeStudent[] Liststudents) {
        CollegeStudent[] src = (Liststudents == null) ? new CollegeStudent[0] : Liststudents;
        this.Liststudents = new CollegeStudent[src.length];
        for (int i = 0; i < src.length; i++) {
            this.Liststudents[i] = new CollegeStudent(src[i]);  // write into this.Liststudents
        }
    }

    public String getCourseName(){ return courseName; }
    public void setCourseName(String courseName){ this.courseName = courseName; }

    @Override
    public String toString() {
        String s = "";
        s += "Course: " + this.courseName + "\n";
        s += "Professor:\n" + this.instructor.toString();
        s += "College Student Info:\n";
        for (int i = 0; i < Liststudents.length; i++) s += Liststudents[i].toString() + "\n";
        return s;
    }
}