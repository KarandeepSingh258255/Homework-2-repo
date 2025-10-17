public class Person {
   //Data Fields
    private String name;
    private Boolean alive;
    private int age;
    private String SSN;

    //Setters/Getters
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
    public Boolean getAlive() {
        return alive;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    public String getSSN() {
        return SSN;
    }

    //constructors
    public Person (String name, Boolean alive, int age, String SSN) {
        this.name = name;
        this.alive = alive;
        this.age = age;
        this.SSN = SSN;
    }

    public Person() {
        this.name = "";
        this.alive = true;
        this.age = 0;
        this.SSN = "000-00-0000";
    }

    public Person(Person other){
        this.name = other.name;
        this.alive = other.alive;
        this.age = other.age;
        this.SSN = other.SSN;
    }

    //toString
    public String toString() {
        String s = "";
        s += "\nPerson Information\n";
        s += "\nName: " + name;
        s += "\nAlive: " + alive;
        s += "\nAge: " + age;
        s += "\nSSN: " + SSN;
        return s;
    }


}
