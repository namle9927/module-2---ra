package string;
import java.util.regex.Pattern;
public class b13 {
    public static void main(String[] args) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String email = "rikeiacademy@rikkeisoft.com";
        System.out.println(email + ": " + Pattern.matches(emailRegex, email));

    }
}
