import javax.xml.bind.SchemaOutputResolver;

public class HandleString {
    public static void main(String[] args) {
        String fullName = "hung";
        String str2 = "hung";
        System.out.println(fullName);
        System.out.println("do dai" + fullName.length());
        System.out.println("ky tu so 2 " + fullName.charAt(2));
        System.out.println("hieu cua 2 chuoi dang keycode: " + fullName.compareTo(str2) );//muc dich de so sang 2 chuoi tien hanh sap xep

        StringBuilder stringBuilder = new StringBuilder("hung");
        System.out.println(stringBuilder.toString());
        stringBuilder.append("rikkei");
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(4,"insert",0,2);
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(2,4);
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
