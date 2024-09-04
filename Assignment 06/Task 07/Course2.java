// Method Overloading can be seen in this problem. The "addContent" method is being overloaded. This is the difference between Task 06 and Task 07
public class Course2 {
    public String name;
    public String code ;
    public String syllabus ;
    public int count ;
    public void createCourse(String name, String code){
        this.name = name ;
        this.code = code;
    }
    public void printDetails(){
        System.out.println("Course Details:");
        System.out.println("Course Name: "+name);
        System.out.println("Course Code: "+code);
        System.out.println("Course Syllabus:");
        if (syllabus== null){
            System.out.println("No content yet.");
        }
        else {
            System.out.println(syllabus);
        }
    }
    public void addContent(String cname){
        if (count < 4){
            if (count == 0){
                syllabus = cname;
            }
            else {
                syllabus += ", ";
                syllabus += cname;
            }
            count += 1 ;
            System.out.println(cname+ " was added");
        }
        else {
            System.out.println("Cannot add more content");
        }
    }
    public void addContent(String cname1, String cname2 ){
        if (count < 4){
            if (count == 0){
                syllabus = cname1;
            }
            else {
                syllabus += ", ";
                syllabus += cname1;
            }
            count += 1 ;
            System.out.println(cname1+ " was added");
        }
        else {
            System.out.println("Cannot add more content");
        }
        if (count < 4){
            if (count == 0){
                syllabus = cname2;
            }
            else {
                syllabus += ", ";
                syllabus += cname2;
            }
            count += 1 ;
            System.out.println(cname2+ " was added");
        }
        else {
            System.out.println("Cannot add more content");
        }
    }
}
