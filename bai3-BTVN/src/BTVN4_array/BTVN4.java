package BTVN4_array;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang cua ma tran ");
        int n = sc.nextInt();
        System.out.println("nhap so cot cua ma tran ");
        int m = sc.nextInt();
        //khoi tao mang 2 chieu
        int[][] myNumbers = new int[n][m];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("myNum[%d][%d]",i,j);
                myNumbers[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("mang da nhap la: ");
        show(myNumbers);
        int maxNum = 0;
        int x = 0, y = 0;
        //lap qua mang 2 chieu de tim gia tri lon nhat va toa do gia tri do
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                if (myNumbers[i][j] > maxNum) {
                    maxNum = myNumbers[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("gia tri lon nhat la: " + maxNum);
        System.out.println("toa do gia tri lon nhat la: " + x + ", " + y);

    }
    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

