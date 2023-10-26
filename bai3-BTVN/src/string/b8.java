package string;

import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("toi yeu em Linh");
        System.out.println("hay nhap chuoi can chen");
        String str2 = "Giang";
        System.out.println(str1.replace(11,str1.length(),str2));
    }
}
