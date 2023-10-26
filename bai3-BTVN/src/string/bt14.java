package string;


import java.util.Arrays;
import java.util.Scanner;

public class bt14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ky tu ");
        int x = sc.nextInt();
        System.out.println("nhap chuoi can kiem tra ");
        sc.nextLine();
        String input  = sc.nextLine();
//        String[] arr = str.split(" ");
//        int count  = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i].length() >= x ){
//                count++;
//            }
//        }
//        System.out.println("So tu co so ky tu lon hon hoac bang " + x +" la: " + count);
        demTu(input,x);
    }
    public static void demTu(String str, int x){
        String[] arr = str.split(" ");
        int count  = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length() >= x ){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("So tu co so ky tu lon hon hoac bang " + x +" la: " + count);
    }
}
