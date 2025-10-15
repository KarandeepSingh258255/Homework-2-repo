public class Teacher extends Person{
    private String ID;
    private int monthly_salary;
    private int num_yr_prf;

    //getters

    public String getID(){
        return ID;
    }

    public int getMonthly_Salary(){
        return monthly_salary;
    }

    public int getNum_yr_prf(){
        return num_yr_prf;
    }

    //setters

    public void setID(String ID){
        this.ID = ID;
    }

    public void setMonthly_salary(int monthly_salary){
        this.monthly_salary = monthly_salary;
    }

    public void setNum_yr_prf(int num_yr_prf){
        this.num_yr_prf = num_yr_prf;
    }

    // no arg

    Teacher(){
        super();
        this.ID = "";
        this.monthly_salary = 0;
        this.num_yr_prf = 0;
    }

    //copy

    Teacher(Teacher other){
        this.ID = other.ID;
        this.monthly_salary = other.monthly_salary;
        this.num_yr_prf = other.num_yr_prf;
    }

    Teacher(String name, Boolean alive, int age, String SSN, String ID, int monthly_salary, int num_yr_prf){
        super(name, alive, age, SSN);
        this.ID = ID;
        this.monthly_salary = monthly_salary;
        this.num_yr_prf = num_yr_prf;
    }

    //toString

    public String toString(){
        String s = "";
        s += super.toString();
        s += "\nID number: " + this.ID;
        s += "\nMonthly Salary: " + this.monthly_salary;
        s += "\nYears Teaching: " + this.num_yr_prf;

        return s;
    }

}
