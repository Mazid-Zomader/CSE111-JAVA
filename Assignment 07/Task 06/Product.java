public class Product {
    private String name;
    private double price;
    private int quantity;
    Product(){
        this.name = "unknown";
    }
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void displayInfo(){
        System.out.print("Product Name: "+ this.name+"\nPrice: $"+this.price);


    }
    public void displayInfo(boolean flag){
        System.out.println("Product Name: "+ this.name+"\nPrice: $"+this.price+"\nQuantity: "+this.quantity);
    }
    public void setQuantity(int num){
        this.quantity = num;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
}
