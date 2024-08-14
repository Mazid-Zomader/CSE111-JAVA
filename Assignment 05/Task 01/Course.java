public class Course{
    public String cName;
    public String code;
    public int credit;
    // Write your code here
    public void createCourse(String cName, String code, int credit){
        this.cName = cName;
        this.code = code;
        this.credit = credit;
    }
    public void displayCourse(){
        System.out.println("Course Name: " + cName);
        System.out.println("Course Code: " + code);
        System.out.println("Course Credit: " + credit);
    }
    public void updateCourse(String cName, String code, int credit){
        this.cName = cName;
        this.code = code;
        this.credit = credit;
    }
}
