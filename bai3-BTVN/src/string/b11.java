package string;

public class b11 {
    public static void main(String[] args) {
        String myStr = "      Le Ngoc Nam       ";
        System.out.println(loaiBoKhoangTrang(myStr));
    }

    public static String loaiBoKhoangTrang(String str) {
        String outPut = str.trim();
        return outPut;
    }
}
