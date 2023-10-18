package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao so a");
        int a = sc.nextInt();
        System.out.println("hay nhap vao so b");
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            if (i % 2 == 0 ){
                sum += i;
            }
        }
        System.out.println("ket qua la: " + sum);
    }
}
