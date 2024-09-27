public class Student {
    public String name;
    public double cg;
    public String major;
    public int id;
    public static int total_student;
    public static int cse ;
    public static int non_cse;
    Student (String name, double cg){
        this.name = name;
        this.cg = cg;
        major = "CSE";
        Student.total_student++;
        this.id = Student.total_student;
        Student.cse++;
    }
    public static Student createStudent (String name, double cg, String major){
        return new Student(name, cg, major);
    }
    Student (String name, double cg, String major){
        this.name = name;
        this.cg = cg;
        this.major = major;
        Student.total_student++;
        this.id = Student.total_student;
        Student.non_cse++;
    }
    public void individualDetail(){
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cg);
        System.out.println("Department: " + this.major);
    }
    public static void printDetails(){
        System.out.println("Total Student(s): " + Student.total_student);
        System.out.println("CSE Student(s): " + Student.cse);
        System.out.println("Other Department Student(s): " + Student.non_cse);
    }


}
