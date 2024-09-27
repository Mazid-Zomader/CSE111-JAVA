public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name ;
    public String[] books = new String[10];
    public int counter;
    // Your Code here
    Borrower(String name){
        this.name = name ;
    }
    public void borrowBook(String book_name){
        for (int index = 0; index < Borrower.book_name.length; index++){
            if (Borrower.book_name[index].equals(book_name)){
                if (Borrower.book_count[index] > 0){
                    this.books[counter] = book_name;
                    Borrower.book_count[index]--;
                    counter++;
                    break;
                }
                else {
                    System.out.println("This book is not available");
                    break;
                }
            }
        }
    }
    public static void bookStatus(){
        System.out.println("Available Books: ");
        for (int index = 0; index < Borrower.book_count.length; index++){
            System.out.println(Borrower.book_name[index]+": "+Borrower.book_count[index]);
        }
    }
    public void borrowerDetails(){
        System.out.println("Name: "+this.name+"\nBooks Borrowed:");
        for (int index = 0; index < this.books.length; index++){
            if (books[index]==null){
                break;
            }
            else {
                System.out.println(books[index]);
            }
        }
    }
    public static int remainingBooks(String book_name){
        for (int index = 0; index < Borrower.book_count.length; index++){
            if (Borrower.book_name[index].equals(book_name)){
                return Borrower.book_count[index];
            }
        }
        return 0;
    }
}