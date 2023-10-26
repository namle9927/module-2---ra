package BTVN5_array;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN5 {
    public static void main(String[] args) {
        System.out.println("nhap so phan tu cua mang");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrNum = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.println("nhap phan tu thu " + i + " cua mang");
            arrNum[i] = sc.nextInt();
        }
        System.out.println("mang da nhap la: " + Arrays.toString(arrNum));
        int minNum = arrNum[0];
        for (int i = 1; i < size ; i++) {
            if (arrNum[i] < minNum){
                minNum = arrNum[i];
            }
        }
        System.out.println("gia tri nho nhat la: " +minNum);
    }
}
