public class Professor extends Teacher {
    private String specialty;
    private String research_area;
    private String rank;
    private boolean Tenured;

    //getters
    public String getSpecialty() {
        return specialty;
    }

    public String getResearch_area() {
        return research_area;
    }

    public String getRank() {
        return rank;
    }

    public Boolean getTenured() {
        return Tenured;
    }

    //setters


    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setResearch_area(String research_area) {
        this.research_area = research_area;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setTenured(Boolean tenured){
        this.Tenured = tenured;
    }

    //no arg
    Professor(){
        super();
        this.specialty = "";
        this.research_area = "";
        this.rank = "";
        this.Tenured = false;
    }

    // fully-loaded
    Professor(String name, Boolean alive, int age, String SSN, String ID, int monthly_salary, int num_yr_prf, String specialty, String research_area, Boolean Tenured){
        super(name, alive, age, SSN, ID, monthly_salary, num_yr_prf);
        this.specialty = specialty;
        this.research_area = research_area;
        this.rank = rank;
        this.Tenured = Tenured;
    }

    //copy

    Professor(Professor other){
        super(other);
        this.specialty = other.specialty;
        this.research_area = other.research_area;
        this.rank = other.rank;
        this.Tenured = other.Tenured;
    }

    public String toString(){
        String s = "";
        s += super.toString();
        s += "Specialty: " + this.specialty;
        s += "Research Area: " + this.research_area;
        s += "Rank: " + this.rank;
        s += "Tenured" + Tenured;
        return s;
    }

}

