public class MoneyTracker {
    public String name ;
    public double amount ;
    public double lastadd;
    public double lastexpense;
    public String info(){
        return ("Name: "+name+"\nCurrent Balance: "+amount);
    }
    public void income(int amount){
        this.amount += amount;
        System.out.println("Balance Updated!");
        lastadd = amount;
    }
    public void expense(int amount){
        if (amount < this.amount){
            this.amount -= amount;
            System.out.println("Balance Updated.");
            lastexpense = amount;
        }
        else if (this.amount - amount == 0){
            System.out.println("You are broke!");
        }
        else {
            System.out.println("Not enough balance.");
        }
    }
    public void showHistory(){
        System.out.println( "Last added: "+lastadd+"\nLast expense: "+lastexpense);
    }
    public void createTracker(String name){
        this.name = name;
        amount = 1.0;
    }
}
