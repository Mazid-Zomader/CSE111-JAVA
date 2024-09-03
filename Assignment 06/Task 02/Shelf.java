public class Shelf {
    public int capacity ;
    public int books ;
    public void showDetails(){
        System.out.println("Shelf capacity: "+capacity+"\nNumber of books: "+ books);
    }
    public void addBooks(int num){
        if (capacity == 0  ){
            System.out.println("Zero capacity. Cannot add books");
        }
        else if ( num > capacity-books) {
            System.out.println("Exceeds capacity");
        }
        else {
            books += num ;
            System.out.println(num+" books added to shelf.");
        }
    }
}
