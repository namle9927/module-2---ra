package BTVN3_array;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap vao mang dau tien
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("hay nhap phan tu co index so " + i + " cua mang 1");
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println("hay nhap phan tu co index so " + i + " cua mang 2");
            arr2[i] = sc.nextInt();
        }
        System.out.println("mang thu nhat la " + Arrays.toString(arr1));
        System.out.println("mang thu hai la " + Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int k = 0;
        for (int i = arr1.length; i < arr3.length ; i++) {
            arr3[i] = arr2[k];
            k++;
        }
        sc.close();
        System.out.println("mang sau khi da gop la " + Arrays.toString(arr3));
    }

}
