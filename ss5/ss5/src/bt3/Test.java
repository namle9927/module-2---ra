package bt3;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(3.5f,5.6f);
        System.out.println(p1);
        MovablePoint movablePoint1 = new MovablePoint(3.5f,5.6f,4f,5f);
        System.out.println(movablePoint1.move(3f,5f));

    }
}
