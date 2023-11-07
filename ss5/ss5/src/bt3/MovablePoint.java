package bt3;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed ){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed,ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return "("+ super.getX() + "," + super.getY()+"),speed=(" + xSpeed +","+ ySpeed +")";
    }
    public float newX = this.getX();
    public float newY = this.getY();

    public MovablePoint move(float xSpeed, float ySpeed){
        newX += xSpeed;
        newY += ySpeed;
        this.setX(newX);
        this.setY(newY);
        return this;
    }
}
