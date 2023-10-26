public class method {
    public static void main(String[] args) {
if (checkNumberIsPrime(5)){
    System.out.println(" chuan roi");
}

    }
    public static boolean checkNumberIsPrime(int number){
//        if (number < 2){
//            //ko la so ngto
//            return false;
//        }
        for (int i = 2; i < Math.sqrt(number) ; i++) {
            if (number % i ==0){
                return false;
            }
        }
        return number >= 2;
    }
}
