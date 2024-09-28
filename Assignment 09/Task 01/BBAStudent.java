public class BBAStudent extends Student {
    BBAStudent(){
        super.updateName("Default");
        super.updateDepartment("BBA");
    }
    BBAStudent(String name){
        super.updateName(name);
        super.updateDepartment("BBA");
    }
}
