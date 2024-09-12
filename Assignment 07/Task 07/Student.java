public class Student {
    private int id;
    private double cg;
    private int count ;
    private int limit;
    private String[] courses;
    Student(int id){
        this.id = id;
    }
    Student (int id, double cg){
        this.id = id;
        this.cg = cg ;
        this.setCG(cg);
    }
    public void addCourse(String name){
        if (cg == 0){
            System.out.println("Failed to add "+name );
            System.out.println("Set CG first");
        }
        else if (cg < 3){
            if (count < limit){
                courses[count] = name ;
                count += 1;
            }
            else {
                System.out.println("Failed to add "+name );
                System.out.println("CG is low.Can't add more than 3 courses");
            }

        }
        else {
            if (count < limit){
                courses[count] = name ;
                count += 1;
            }
            else {
                System.out.println("Maximum "+limit+" courses allowed.");
            }
        }
    }
    public void setCG(double num){
        this.cg = num ;
        if (this.cg< 3){
            this.limit = 3;
        }
        else {
            this.limit = 4 ;
        }
        courses = new String[this.limit];
    }
    public void showAdvisee(){
        System.out.println("Student ID: "+this.id+", CGPA: "+this.cg);
        if (courses[0] == null){
            System.out.println("No courses added");
        }
        else {
            System.out.println("Added courses are:");
        for (int i = 0 ; i< this.limit; i++){
            if (courses[i] != null){
                System.out.print(courses[i]+" ");
            }
        }
        System.out.println();
        }
    }
    public void rmAllCourse(){
        courses = new String[this.limit];
        count = 0;
    }
    public void setID(int num){
        this.id = num;
    }
    public void addCourse(String[] courses){
        for (int i = 0; i < courses.length ; i++){
            if (count < limit){
                this.courses[count] = courses[i];
                count += 1;
            }
            else {
                System.out.println("Failed to add "+courses[i] );
                System.out.println("Maximum "+limit+" courses allowed.");
            }
        }
    }
}
