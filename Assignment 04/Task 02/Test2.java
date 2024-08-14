public class Test2{
    public static void main(String [] args){
        Circle circle = new Circle();
        System.out.println("Radius of the circle is "+ circle.radius);
        System.out.println("The area of the circle is "+ (3.1416*(Math.pow(circle.radius,2))));
        System.out.println("The circumference of the circle is "+(2*3.1416*circle.radius));
    }
}
