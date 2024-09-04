public class Shape {
    public String name;
    public double area ;
    public void setParameters(String name, int num){
        this.name = name ;
        this.area = Math.PI*num*num;
    }
    public void setParameters(String name, int num1, int num2){
        this.name = name;
        this.area = 0.5*num1*num2;
    }
    public void setParameters(String name, int num1, int num2, int num3){
        this.name = name;
        this.area = 0.5*(num1+num2)*num3 ;
    }
    public String details(){
        return "Shape name: "+this.name +"\nArea: "+this.area;
    }
}
