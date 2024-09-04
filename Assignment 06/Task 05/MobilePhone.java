public class MobilePhone {
    public int[] numbers;
    public String[] names;
    public int capacity ;
    public int count ;
    public void setContactCapacity(int num) {
        numbers = new int[num];
        names = new String[num];
        this.capacity = num ;
    }
    public void details(){
        if (numbers[0]==0){
            System.out.println("Total Contacts: "+count);
            System.out.println("Contact List:");
        }
        else {
            System.out.println("Total Contacts: "+count);
            System.out.println("Contact List:");
            for (int i = 0; i < numbers.length; i++){
                if (numbers[0]==0){
                    break;
                }
                else {
                    System.out.println(names[i]+":"+numbers[i]);
                }
            }
        }
    }
    public void addContact(String name, int number){
        if (count < capacity){
            names[count] = name;
            numbers[count]= number;
            count+= 1;
            System.out.println("The contact of "+name+" is added.");
        }
        else {
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int num){
        int index= 0;
        boolean flag = false ;
        for (int i = 0; i< numbers.length; i++){
            if (numbers[i] == num) {
                flag = !flag ;
                index = i ;
                break ;
            }
        }
        if (flag){
            System.out.println("Calling "+names[index]+"...");
        }
        else {
            System.out.println("Calling "+ num+"...");
        }
    }
}
