public class Bus {
    public int capacity;
    public String stoppage;
    Bus(int capacity, String stoppage) {
        this.capacity = capacity;
        this.stoppage = stoppage;
    }
    public void addPassenger(String name, String stoppage){
        if (capacity <= 0){
            System.out.println("Bus is full.");
        }
        else if (stoppage != this.stoppage){
            System.out.println("Sorry "+name+"! The bus won't stop at "+stoppage+"\nUse another bus.");
        }
        else {
            System.out.println(name +" added to the bus");
            capacity--;
        }
    }
    public void addPassenger(String name){
        System.out.println(name +" added to the bus\n"+name+" will get off at the last stop");
        capacity--;
    }

}
