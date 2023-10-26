package BTVN7;

import java.util.Scanner;

public class BTVN7_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap vao kich thuoc ma tran vuong can tinh");
        int x = sc.nextInt();
        int[][] arrNum = new int[x][x];
        System.out.println("nhap cac phan tu cua mang");
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("myNum[%d][%d]",i,j);
                arrNum[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x ; j++) {
                if (i == j){
                   sum += arrNum[i][j];
                }
            }
        }
        show(arrNum);
        System.out.println("ket qua la: " + sum);
    }
    public static void show(int[][] arr) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
