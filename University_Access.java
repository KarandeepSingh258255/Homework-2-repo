public class University_Access {
    public static void main(String args[]) {
        //Department 1
        CollegeStudent s1 = new CollegeStudent("Barth", true, 19, "123-45-6789", "S003", 0.45, "Computer Science", "First Year");
        CollegeStudent s2 = new CollegeStudent("Garen", true, 20, "234-56-7890", "S002", 3.9, "Computer Science", "First Year");
        CollegeStudent s3 = new CollegeStudent("Karan", true, 19, "345-67-8901", "S003", 3.8, "Computer Science", "First Year");
        CollegeStudent s4 = new CollegeStudent("Ethan", true, 18, "456-78-9012", "S004", 3.5, "Computer Science", "First Year");

        Professor p1 = new Professor("Sophia", true, 22, "5343535", "1121", 10000000, 1, "Math", "calc", false);
        Professor p2 = new Professor("Joshua", true, 29, "524232", "23233", 10000, 5, "English", "Harry potter", true);
        Professor p3 = new Professor("Brian", true, 53, "45343", "5333", 845343, 10, "Science", "meow",true );

        Course c1 = new Course(p1, new CollegeStudent[]{s1, s2, s3}, "calc 1");
        Course c2 = new Course(p2, new CollegeStudent[]{s2, s3, s4}, " intro to CS");

        Department d1 = new Department(p1, new Professor[]{p1, p2}, new Course[]{c1, c2});
        Department d2 = new Department(p3, new Professor[]{p3}, new Course[]{new Course(c2)});

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(d1);
        System.out.println();
        System.out.println(d2);
    }
}
