public class Cat extends Animal {
    public String variant;
    Cat(String name, int age, String color, String variant){
        super(name, age, color);
        this.variant = variant;
    }
    public String info(){
        return super.info() +"Variant: "+ this.variant ;
    }
    public void makeSound(){
        if (name == null){
            super.makeSound();
        }
        else {
            System.out.println(this.color+" colour "+this.name+" is meowing");
        }
    }
}
