public class Dog extends Animal{
    //Your Code Here
    public String name;
    public Dog(){
        super();
        System.out.println("The dog says hello!");
    }
    public String getName(){
        return name;
    }
    public void updateSound(String sound){
        this.sound = sound;
    }
}
