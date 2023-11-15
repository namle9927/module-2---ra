package b12;

import java.util.Scanner;
import java.util.Stack;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> string = new Stack<>();
        System.out.println("Hay nhap so luong cac tu can dao chieu");
        int numberOfword = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfword; i++) {
            System.out.println("Hay nhap tu thu " + (i+1));
            string.push(sc.nextLine());
        }
        System.out.println("Chuoi ban dau la: " + string);
        System.out.println("Sau khi dao nguoc la: ");

        for (int i = 0; i < numberOfword  ; i++) {
            System.out.print(string.pop() + " ");
        }
//        System.out.println(string.pop());
    }
}
