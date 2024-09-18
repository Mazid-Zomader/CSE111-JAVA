public class Passenger {
    public static int no_of_passenger;
    public static double total_fare;
    public double fare;
    public String name;
    Passenger(String name, double fare){
        this.name = name;
        this.fare = fare*20;
        Passenger.total_fare += this.fare;
        Passenger.no_of_passenger += 1;
    }
    public void passengerDetails(){
        System.out.println("Name: "+ this.name);
        System.out.println("Fare: "+this.fare+" TK");
    }
    public void setBaggageWeight(double weight){
        this.fare += weight*10;
        Passenger.total_fare += weight*10;;
    }
}
