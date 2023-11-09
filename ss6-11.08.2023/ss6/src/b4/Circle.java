package b4;

public class Circle extends Shape {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(String color) {
        super(color);
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return this.r*this.r*Math.PI;
    }
}
