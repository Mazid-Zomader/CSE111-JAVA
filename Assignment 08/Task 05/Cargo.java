public class Cargo {
    public static double cap = 10.0;
    public String name;
    public double ind_cap; //individual capacity
    public boolean loaded;
    public static int id;
    public int ind_id; //individual id
    public static double capacity(){
        return cap;
    }
    Cargo(String name, double ind_cap){
        this.name = name;
        this.ind_cap = ind_cap;
        Cargo.id++;
        this.ind_id = Cargo.id;

    }
    public void load(){
        if (Cargo.cap-this.ind_cap > 0){
            loaded = true;
            Cargo.cap -= ind_cap;
            System.out.println("Cargo "+this.ind_id+" loaded for transport");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        loaded = false;
        Cargo.cap += this.ind_cap;
        System.out.println("Cargo "+this.ind_id+" unloaded");
    }
    public void details(){
        System.out.println("Cargo ID: "+this.ind_id+", Contents: "+this.name+", Weight: "+this.ind_cap+", Loaded: "+this.loaded);
    }
}
