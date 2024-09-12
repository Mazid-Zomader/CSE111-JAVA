public class Student {
    public String name;
    public String prog;
    Student(String name, String dept){
        this.name = name;
        this.prog = dept;
    }
    public void updateName(String name){
        this.name = name ;
    }
    public void updateProgram(String dept){
        this.prog = dept ;
    }
    public String accessName(){
        return this.name ;
    }
    public String accessProgram(){
        return this.prog;
    }
}
