package BTVN6;

import java.util.Scanner;

public class BTVN6Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran ");
        int n = sc.nextInt();
        System.out.println("nhap so cot cua ma tran ");
        int m = sc.nextInt();
        //khoi tao mang 2 chieu
        double[][] myNumbers = new double[n][m];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("myNum[%d][%d]",i,j);
                myNumbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("nhap cot can tinh tong");
        int y = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += myNumbers[i][y];
        }
        show(myNumbers);
        System.out.println("ket qua la: " + sum);

    }
    public static void show(double[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
