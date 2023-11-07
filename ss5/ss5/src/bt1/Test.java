package bt1;

public class Test {
    public static void main(String[] args) {
        Circle tron1 = new Circle(5,"red");
        Circle tron2 = new Circle(6,"blue");
        Circle tron3 = new Circle(7,"black");
        System.out.println(tron1);
        System.out.println(tron2);
        System.out.println(tron3);
        Cylinder tru1 = new Cylinder(5,"red",6);
        Cylinder tru2 = new Cylinder(6,"red",7);
        Cylinder tru3 = new Cylinder(7,"red",8);
        System.out.println(tru1);
        System.out.println(tru2);
        System.out.println(tru3);
    }
}
