package bai8;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("hay nhap canh dau tien cua tam giac");
            double a = sc.nextDouble();
            System.out.println("hay nhap canh thu hai cua tam giac");
            double b = sc.nextDouble();
            System.out.println("hay nhap canh thu ba cua tam giac");
            double c = sc.nextDouble();
            if (a > 0 && b > 0 && c > 0 && a+b>c && c+b>a && a+c>b ) {
                double chuVi = Math.floor(a + b + c);
                double thamSo = chuVi/2;
                double dienTich = Math.sqrt(thamSo*(thamSo-a)*(thamSo-b)*(thamSo-c));
                System.out.println("dien tich tam giac la " + dienTich);
                System.out.println("chu vi tam giac la " + chuVi);
                break;
            } else {
                System.out.println("hay nhap lai cac canh cua tam giac");
            }
        }
    }
}
