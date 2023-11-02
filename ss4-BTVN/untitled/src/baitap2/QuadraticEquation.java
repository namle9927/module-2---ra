package baitap2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double delta() {
        return b * b - 4 * a * c;
    }
    public void ptBac2(){
        double delta = delta();
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0){
            System.out.println("Phuong trinh co nghiem kep:" + getRootDuplicate());
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + getRoot1() + " x2 = " + getRoot2());
        }
    }


    public  double getRoot1() {
        return (-b + Math.sqrt(delta())) / (2 * a);
    }

    public  double getRoot2() {
        return (-b - Math.sqrt(delta())) /(2 * a);
    }
    public double getRootDuplicate(){
        return -b/2*a;
    }

    Scanner sc = new Scanner(System.in);


    public void input() {
        System.out.println("hay nhap a:");
        this.a = sc.nextDouble();
        System.out.println("hay nhap b:");
        this.b = sc.nextDouble();
        System.out.println("hay nhap c:");
        this.c = sc.nextDouble();
    }


}
