package string;

public class b4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Le Ngoc Nam");
        String str2 = "Le Ngoc Nam";
        String[] arr = str2.split("",20);
        for (String a: arr
             ) {
            System.out.println(a);
        }
    }
}
