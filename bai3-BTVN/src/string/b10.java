package string;

public class b10 {
    public static void main(String[] args) {
    String myStr = "lE nGOC nAM";
        System.out.println(doiChuhoaChuThuong(myStr));
    }

    public static String doiChuhoaChuThuong(String str) {
        StringBuilder ketQua = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char kyTu = str.charAt(i);
            if (Character.isUpperCase(kyTu)) {
                ketQua.append(Character.toLowerCase(kyTu));
            } else {
                ketQua.append(Character.toUpperCase(kyTu));
            }
        }
        return ketQua.toString();
    }
}
