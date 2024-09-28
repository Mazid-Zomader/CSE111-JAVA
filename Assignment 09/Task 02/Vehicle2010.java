public class Vehicle2010 extends Vehicle {
    public void moveLowerLeft(){
        super.moveLeft();
        super.moveDown();
    }
    public void moveUpperRight(){
        super.moveRight();
        super.moveUp();
    }
    public void moveLowerRight(){
        super.moveRight();
        super.moveDown();
    }
}
