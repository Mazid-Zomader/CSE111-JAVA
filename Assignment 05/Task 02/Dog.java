public class Dog {
    public String name = "dog";
    private String colour;
    public void changeName(String newName) {
        name = newName;
    }
    public String bark(){
        if (name == "dog") {
            if (colour == null) {
                return "A dog is barking.";
            }
            return colour+" dog is barking.";
        }
        else {
            if (colour == null) {
                return (name + " is barking.");
            }
            return name + " the "+colour+" dog is barking.";
        }
    }
    public void changeColor(String co){
        colour = co;
        if (name == "dog"){
            System.out.println("This "+name+" is "+colour+".");
        }
        else {
            System.out.println(name + " is " + colour+".");
        }
    }
}
