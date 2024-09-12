public class Parcel {
    public String name ;
    public int weight;
    public double fee;
    Parcel(){

    }
    Parcel(String name){
        this.name = name ;
    }

    Parcel (String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public void printDetails(){
        if (this.name == null){
            System.out.println("Set name first");
        }
        else {
            System.out.println("Name: "+ this.name);
            System.out.println("Total Weight: "+ this.weight);
            System.out.println("Total Fee: "+ this.fee);
        }
    }
    public void calcFee(String place){
        if (this.weight == 0){
            this.fee = 0;
        }
        else if (place == "Dhanmondi"){
            this.fee = (this.weight*20)+ 50;
        }
        else {
            this.fee = this.weight*20 ;
        }
    }
    public void addWeight(int weight){
        this.weight += weight;
        System.out.println( "Updated Weight: "+ this.weight );
    }
}
