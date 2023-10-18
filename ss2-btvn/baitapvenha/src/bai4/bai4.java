package bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so so nguyen to muon in");
        int num = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.printf("%d so nguyen to dau tien la: ", num);
        while (count < num){
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                }

            }
            if (check){
                System.out.print(n +",");
                count++;
            }
            n++;
        }

    }
}
