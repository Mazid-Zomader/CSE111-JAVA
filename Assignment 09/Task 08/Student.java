public class Student {
    public String name;
    static int total;
    static int cse;
    static int non_cse;
    int serial;
    public String dept;
    Student(String name, String dept){
        this.name = name;
        this.dept = dept;
        Student.total ++;
        System.out.println("Creating Student Number: "+ Student.total );
        if (this.dept == "CSE"){
            Student.cse++;
            this.serial = Student.cse;
        }
        else {
            Student.non_cse++;
            this.serial = Student.non_cse;
        }
    }
    static void totalInfo(){
        System.out.println("Total Student: "+ Student.total);
        System.out.println("Total CSE Student: "+ Student.cse);
        System.out.println("Total BBA Student: "+ Student.non_cse);
    }
    void individualInfo(){
        System.out.println(this.name+" is from "+this.dept+ " department");
        System.out.println("Serial of "+this.name+" among all students' is: "+this.total);
        System.out.println("Serial of "+this.name+" among "+this.dept+" students' is: "+this.serial);
    }
}
