public class Department {
    private Professor chair;
    private Professor[] listFaculty;
    private Course[] listCourses;

    //set get
    public void setChair(Professor chair) {
        this.chair = chair;
    }
    public Professor getChair() {
        return chair;
    }

    public void setFaculty(Professor[] listFaculty) {
        this.listFaculty = new Professor[listFaculty.length];

        for(int i = 0; i < listFaculty.length; i++) {
            listFaculty[i] = new Professor(listFaculty[i]);
        }
    }
    public Professor[] getListFaculty() {
        Professor copy[] = new Professor[listFaculty.length];

        for(int i = 0; i < listFaculty.length; i++) {
            copy[i] = listFaculty[i];
        }
        return copy;
    }

    public void setCourses(Course[] listCourses) {
        this.listCourses = new Course[listCourses.length];

        for(int i = 0; i < listCourses.length; i++) {
            listCourses[i] = new Course(listCourses[i]);
        }
    }
    public Course[] getListCourses() {
        Course copy[] = new Course[listCourses.length];

        for(int i = 0; i < listCourses.length; i++) {
            copy[i] = listCourses[i];
        }
        return copy;
    }

    //constructors

    public Department (Professor chair, Professor[] listFaculty, Course[] listCourses) {
        this.chair = chair;
        this.listFaculty = new Professor[listFaculty.length];
        for(int i = 0; i < listFaculty.length; i++) {
            this.listFaculty[i] = new Professor(listFaculty[i]);
        }
        this.listCourses = new Course[listCourses.length];
        for(int i = 0; i < listCourses.length; i++) {
            this.listCourses[i] = new Course(listCourses[i]);
        }
    }

    public Department() {
        this.chair = new Professor(chair);
        this.listFaculty = new Professor[listFaculty.length];
        for(int i = 0; i < listFaculty.length; i++) {
            this.listFaculty[i] = new Professor(listFaculty[i]);
        }
        this.listCourses = new Course[listCourses.length];
        for(int i = 0; i < listCourses.length; i++) {
            this.listCourses[i] = new Course(listCourses[i]);
        }
    }

    //toString
    public String toString() {
        String s = "";
        s += "Department Chair: " + chair;
        s += "\nFaculty: \n";
        for (int i = 0; i < listFaculty.length; i++) {
            s += "\nProfessor Information: \n" + this.listFaculty[i].toString();
        }
        s += "\nCourses: \n";
        for(int i = 0; i < listCourses.length; i++) {
            s += "\nCourse Information: \n" + this.listCourses[i].toString();
        }
        return s;
    }
}
