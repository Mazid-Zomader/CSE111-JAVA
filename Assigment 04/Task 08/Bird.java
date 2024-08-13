public class Bird {
    public String name;
    public int inAir = 0;
    public void flyUp(int num){
        System.out.println(name+" has flown up "+num+" feet");
        inAir += num;
    }
    public void flyDown(int num) {
        if (num > inAir) {
            System.out.println(name+" cannot fly down "+num+" feet");
        }
        else {
            inAir -= num;
            System.out.println(name+" has flown down "+num+" feet");
        }
    }
    public void makeNoise(){
        if (name == "Parrot"){
            System.out.println("Squawk");
        }
        else {
            System.out.println("Squee");
        }
    }

}
