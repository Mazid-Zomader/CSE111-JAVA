public class Account{
    public static int count;
    String name;
    int age;
    String job;
    int salary;
    Account(String name, int age, String job, int salary){
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        Account.count++;
    }
    void addMoney(int amount){
        this.salary += amount;
    }
    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + job);
        System.out.println("Total Amount: " + salary);
    }
    void withdrawMoney(int amount){
        if (this.salary >= amount){
            this.salary -= amount;
        }
        else{
            System.out.println("Insufficient money for withdrawal!");
        }
    }
}
