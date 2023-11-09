package b4;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(12,4);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
    }
}
