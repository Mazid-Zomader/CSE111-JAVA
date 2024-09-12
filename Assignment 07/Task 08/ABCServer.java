public class ABCServer {
    public String name ;
    public int capacity ;
    public int members;
    public String[] names ;
    public String[] role ;
    ABCServer(){
        this.name = "Default";
        this.capacity = 10;
        this.members = 0;
        names = new String[capacity];
        role = new String[capacity];
    }
    ABCServer(String name, int capacity){
        this.name = name ;
        this.capacity = capacity;
        names = new String[capacity];
        role = new String[capacity];
    }
    public void details(){
        System.out.println("Server name: "+this.name);
        System.out.println("Member Capacity: "+this.capacity);
        System.out.println("Total Members: "+this.members);
        System.out.println("Members:");
        for (int i = 0 ; i < this.members; i++){
            System.out.println("Name:Role --> "+this.names[i]+":"+this.role[i]);
        }
    }
    public void addMembers(String name){
        if (members< capacity){
            this.names[members]= name ;
            this.role[members] = "Rising Hero";
            System.out.println("Rising Hero is added");
            members += 1 ;
        }
        else {
            System.out.println("Sorry, maximum capacity exceeded!");
        }
    }
    public void addMembers(String name, String role){
        if (members< capacity){
            this.names[members]= name ;
            this.role[members] = role;
            System.out.println(role+" is added");
            members += 1;
        }
        else {
            System.out.println("Sorry, maximum capacity exceeded!");
        }
    }
}
