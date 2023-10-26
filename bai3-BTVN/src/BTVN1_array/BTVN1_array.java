package BTVN1_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BTVN1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNum = {1, 2, 3, 4, 5, 6, 5, 5, 5, 67, 43, 23};
        System.out.println("nhap gia tri phan tu can xoa");
        int x = sc.nextInt();
        int vitri = 0;
        //boolean check = true;
        for (int k = 0; k < arrNum.length; k++) {
            if (arrNum[k] == x){
                for (int i = k; i < arrNum.length - 1 ; i++) {
                    arrNum[i] = arrNum[i + 1];
                }
                arrNum[arrNum.length -1] = 0;
                k--;
            }
//            for (int i = 0; i < arrNum.length; i++) {
//                if (arrNum[i] == x) {
//                    vitri = i;
//                    break;
//                }
//            }
//            for (int i = vitri; i < arrNum.length - 1; i++) {
//                arrNum[i] = arrNum[i + 1];
//            }
        }

        System.out.println("mang moi la " + Arrays.toString(arrNum));
    }
}
