import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = scanner.nextInt();

        String wordsOfNumber = null;
        if (number < 0 || number >= 1000) {
            System.out.println("Số nhập vao không hợp lệ");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {

            wordsOfNumber = "";
            int hundreds = number / 100;
            int remainder = number % 100;


            // Xử lí cho hàng trăm
            switch (hundreds) {
                case 1:
                    wordsOfNumber += "One hundred ";
                    break;
                case 2:
                    wordsOfNumber += "Two hundred ";
                    break;
                case 3:
                    wordsOfNumber += "Three hundred ";
                    break;
                case 4:
                    wordsOfNumber += "Four hundred ";
                    break;
                case 5:
                    wordsOfNumber += "Five hundred ";
                    break;
                case 6:
                    wordsOfNumber += "Six hundred ";
                    break;
                case 7:
                    wordsOfNumber += "Seven hundred ";
                    break;
                case 8:
                    wordsOfNumber += "Eight hundred ";
                    break;
                case 9:
                    wordsOfNumber += "Nine hundred ";
                    break;
            }

            // nếu có remain thì tiếp tục
            if (remainder != 0) {

                int tens = remainder / 10;
                int ones = remainder % 10;
                System.out.println(remainder);
                System.out.println(tens);
                System.out.println(ones);
                // Xử lí cho hàng chục
                if (tens == 1) {
                    //trường hợp  cho số chục 10->19

                    switch (remainder) {
                        case 11:
                            wordsOfNumber += "Eleven";
                            break;
                        case 12:
                            wordsOfNumber += "Twelve";
                            break;
                        case 13:
                            wordsOfNumber += "Thirteen";
                            break;
                        case 14:
                            wordsOfNumber += "Fourteen";
                            break;
                        case 15:
                            wordsOfNumber += "Fifteen";
                            break;
                        case 16:
                            wordsOfNumber += "Sixteen";
                            break;
                        case 17:
                            wordsOfNumber += "Seventeen";
                            break;
                        case 18:
                            wordsOfNumber += "Eighteen";
                            break;
                        case 19:
                            wordsOfNumber += "Nineteen";
                            break;

                        default:
                            // Không làm gì cả nếu không có số chục
                    }
                }

                // Số đơn vị
                if (tens != 1) {
                    switch (tens) {
                        case 2:
                            wordsOfNumber += "Twenty ";
                            break;
                        case 3:
                            wordsOfNumber += "Thirty ";
                            break;
                        case 4:
                            wordsOfNumber += "Forty ";
                            break;
                        case 5:
                            wordsOfNumber += "Fifty ";
                            break;
                        case 6:
                            wordsOfNumber += "Sixty ";
                            break;
                        case 7:
                            wordsOfNumber += "Seventy ";
                            break;
                        case 8:
                            wordsOfNumber += "Eighty ";
                            break;
                        case 9:
                            wordsOfNumber += "Ninety ";
                            break;
                        default:
                    }
                    switch (ones) {
                        case 1:
                            wordsOfNumber += "One";
                            break;
                        case 2:
                            wordsOfNumber += "Two";
                            break;
                        case 3:
                            wordsOfNumber += "Three";
                            break;
                        case 4:
                            wordsOfNumber += "Four";
                            break;
                        case 5:
                            wordsOfNumber += "Five";
                            break;
                        case 6:
                            wordsOfNumber += "Six";
                            break;
                        case 7:
                            wordsOfNumber += "Seven";
                            break;
                        case 8:
                            wordsOfNumber += "Eight";
                            break;
                        case 9:
                            wordsOfNumber += "Nine";
                            break;
                        case 0:
                            wordsOfNumber += "Ten";
                            break;

                        default:
                            // Không làm gì cả nếu không có số đơn vị
                    }
                }
            }
        }

        System.out.println(wordsOfNumber);
    }
}

