package string;

public class b12 {
    public static void main(String[] args) {
    String a = " sdsdsdsgrgf";
        System.out.println(thayTheKyTu(a));
    }


    public static String thayTheKyTu(String inPut) {
        String outPut = inPut.replace("s","t");
        return outPut;
    }
}
