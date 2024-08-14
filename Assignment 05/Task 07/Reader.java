public class Reader {
    public String name;
    public int capacity;
    public String[] books;
    public int count = 0;
    public void createReader(String name,int capacity) {
        this.name = name;
        this.capacity = capacity;
        books = new String[capacity];
    }
    public void readerInfo(){
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        if (books[0] == null) {
            System.out.println("No Books added yet");
        }
        else {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    System.out.println("Book "+(i+1)+": "+books[i]);
                }
            }
        }
    }
    public void addBook(String book){
        if (count < capacity) {
            books[count] = book;
            count += 1;
        }
        else {
            System.out.println("No more space for new book");
        }
    }
    public void increaseCapacity(int num){
        capacity = num;
        System.out.println(name+"'s capacity increased to "+capacity);
        String[] books1 = new String[capacity];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];
        }
        books =books1;
    }

}
