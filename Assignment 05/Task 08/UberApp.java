public class UberApp {
    public String name ;
    public int age ;
    public String number ;
    public int rides;
    public int count = 0 ;
    public double price = 0 ;
    public String[] address ;
    public void createProfile(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
        rides = 3;
        address = new String[rides];
    }
    public void showProfile(){
        System.out.println("Hello! This is your Profile:");
        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + number);
    }
    public int remainingRides(){
        return rides-count;
    }
    public void bookRide(String p_name, double p_price){
        if (count < rides){
            System.out.println(name + " has bookeed a ride!");
            System.out.println("Destination: "+ p_name);
            System.out.println("Fare: " + 30*p_price+" Taka");
            address[count] = p_name;
            count += 1;

        }
        else {
            System.out.println(name + " please update tour plan to premium or wait till next month!");
        }
    }
    public void changeLocation(String p_name, double p_price){
        address[count-1] = p_name;
        System.out.println(name + " has changed the destination of his current location to "+ p_name);
        System.out.print("New fare after adding 20% change fees: ");
        double fine = (20*30*p_price)/100;
        System.out.println(((30*p_price)+ fine)+" Taka");
    }
    public void ridingHistory() {
        if (count != 0) {
            System.out.print(name + ", you have visited ");
            for (int i = 0; i < address.length; i++) {
                if (address[i] != null) {
                    if (i + 1 == address.length) {
                        System.out.print(address[i]);
                    } else if (address[i + 1] == null) {
                        System.out.print(address[i]);
                    } else {
                        System.out.print(address[i] + ", ");
                    }
                }
            }
            System.out.println(" this month.");
        }
        else {
            System.out.println(name+"you haven't visited anywhere this month.");
        }
    }
    public void resetMonth(){
        count = 0;
        address = new String[rides];
    }
}
