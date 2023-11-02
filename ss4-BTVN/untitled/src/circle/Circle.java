package circle;

import java.util.Scanner;

public class Circle {
    private double bankinh;
    private String color;

    public Circle(int bankinh, String color) {
        this.bankinh = bankinh;
        this.color = color;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }
    public double chuVi(){
        return 2*Math.PI*bankinh;
    }
    public double dienTich(){
        return Math.PI*bankinh*bankinh;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap ban kinh: ");
        this.bankinh = Double.parseDouble(sc.nextLine());
        System.out.println("hay nhap mau sac: ");
        this.color = sc.nextLine();
    }
    public void displayData(){
        System.out.println("ban kinh la " + bankinh);
        System.out.println("mau sac la " + color);
        System.out.println("chu vi la " + chuVi());
        System.out.println("dien tich la " + dienTich());

    }
}
