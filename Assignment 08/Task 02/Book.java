public class Book {
    public static int total_books_sold;
    public static double total_revenue;
    public String name;
    public double fare=150;
    Book(String name, int disc){
        this.name = name;
        double discount= this.fare*(disc/100.0);
        this.fare -= discount ;
        Book.total_books_sold+=1;
        Book.total_revenue+= this.fare;
    }
    public void bookDetails(){
        System.out.println("Title: "+this.name);
        System.out.println("Price after Discount: "+this.fare+" TK");
    }

}
