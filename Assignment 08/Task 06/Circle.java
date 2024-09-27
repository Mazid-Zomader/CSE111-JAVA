public class Circle extends Shape {
    //Your Code Here
    public int radius;
    public Circle() {
        super();
    }
    public void area(){
        System.out.println("Area of "+ this.color +" Circle: "+(Math.PI*radius*radius));
    }
    public void displayInfo(){
        super.displayInfo();
    }
}