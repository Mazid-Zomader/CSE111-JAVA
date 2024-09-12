public class Shape2D {
    public String name;
    public double shape_area;
    Shape2D(int num){
        this.name = "Square";
        System.out.println("A Square has been created with length: "+ num);
        this.shape_area = num*num ;
    }
    Shape2D(int num1, int num2){
        this.name = "Rectangle";
        System.out.println("A Rectangle has been created with length: "+num1+" and breadth: "+ num2);
        this.shape_area = num1*num2 ;

    }
    Shape2D(int num1, int num2, String name){
        this.name = name;
        System.out.println("A "+name+" has been created with height: "+num1+" and base: "+num2);
        this.shape_area = 0.5*num1*num2;
    }
    Shape2D(int num1, int num2, int num3){
        this.name = "Triangle";
        System.out.println("A "+this.name+" has been created with the following sides: "+num1+" "+num2+" "+num3);
        double a = (num1+ num2+ num3)/2 ;
        this.shape_area = Math.sqrt(a*(a-num1)*(a-num2)*(a-num3));
    }
    public void area(){
        System.out.println("The area of "+ this.name+" is: "+this.shape_area);
    }
}
