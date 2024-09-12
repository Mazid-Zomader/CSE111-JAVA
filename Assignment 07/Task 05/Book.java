public class Book {
    public int price;
    public String name;
    public String author;
    Book(String name){
        this.name = name ;
    }
    Book(String name, String author){
        this.name = name ;
        this.author = author;
    }
    Book (String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price ;
    }
    public void setDetails(int price){
        this.price = price;
    }
    public void setDetails(String author, int price){
        this.author = author;
        this.price = price;
    }
    public void displayDetails(){
        if (this.name != null){
            System.out.print("Title: "+ this.name);
        }
        if (this.author != null){
            System.out.print(", Author: "+ this.author);
        }
        if(this.price != 0 ){
            System.out.print(", Price: "+this.price);
        }
        System.out.println();
    }
}
