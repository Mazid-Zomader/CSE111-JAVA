public class Employee {
    public String name;
    public double salary = 30000.0;
    public String type = "junior";
    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary+" Tk");
        System.out.println("Employee Designation: " + type);
    }
    public void newEmployee(String name){
        this.name = name;
    }
    public void calculateTax(){
        if (salary > 50000.0){
            System.out.println (name+ " Tax Amount: " + salary*0.3+" Tk");
        }
        else if (salary > 30000.0){
            System.out.println (name+ " Tax Amount: " + salary*0.1+" Tk");
        }
        else {
            System.out.println ("No need to pay tax");
        }
    }
    public void promoteEmployee(String type){
        this.type = type;
        if (type.equals("lead")){
            salary += 50000.0;
        }
        else if (type.equals("senior")){
            salary += 25000.0;
        }
        else if (type.equals("manager")){
            salary += 75000.0;
        }
        System.out.println(name+ " has been promoted to " + type);
        System.out.println("New Salary: " + salary+" Tk");
    }
}
