import java.util.Scanner;

public class Exe3 {

            public static void main(String[] args) {
                System.out.println("Enter your requested phone number");
                Scanner scanner = new Scanner(System.in);
                String typedNumber = scanner.nextLine();
                String result = number(typedNumber);
                System.out.println(result);
            }

            public static String number(String typedNumber) {
                String result;
                String begin = "05";
                String hyphen = "-";
                if (typedNumber.charAt(0) == '0' && typedNumber.charAt(1) == '5' && typedNumber.charAt(3) != '-') {

                    result = begin + typedNumber.charAt(2) + hyphen + typedNumber.charAt(3) + typedNumber.charAt(4) + typedNumber.charAt(5)
                            + typedNumber.charAt(6) + typedNumber.charAt(7) + typedNumber.charAt(8) + typedNumber.charAt(9);
                    typedNumber = result;


                } else if (typedNumber.charAt(0) == '9') {
                        result = begin + typedNumber.charAt(4) + hyphen + typedNumber.charAt(5)
                                + typedNumber.charAt(6) + typedNumber.charAt(7) + typedNumber.charAt(8)
                                + typedNumber.charAt(9);
                        result = result + typedNumber.charAt(10) + typedNumber.charAt(11);
                        typedNumber = result;
                    } else {
                        result = "    ";
                        typedNumber = result;
                    }

                return typedNumber;
            }
        }


