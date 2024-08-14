public class CellPhone {
    public String model = "unknown";
    public int store = 0;
    public int capacity = 3;
    public String[] numbers = new String[capacity];
    public void printDetails(){
        System.out.println("Phone Model " + model);
        System.out.println("Contact Stored " + store);
        if (store > 0) {
            System.out.println("Stored Contact:");
            for (int i = 0; i < store; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
    public void storeContact(String number){
        if (store < capacity) {
        numbers[store] = number;
        store += 1;
        System.out.println("Contact Stored ");}
        else {
            System.out.println("Memory full. New contact can't be stored");
        }
    }
}
