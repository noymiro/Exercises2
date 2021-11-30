import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {
        boolean answer = compareWords();
        System.out.println(answer);
    }

    public static boolean compareWords() {
        boolean answer = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your bigger string");
        String big = scanner.nextLine();
        System.out.println("Enter your smaller string");
        String small = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < big.length()-small.length()+1; i++) {
            for (int j = 0; j < small.length(); j++) {
                if (big.charAt(i+j) == small.charAt(j)) {
                    count++;
                }
                else {
                    count=0;
                    break;
                }
            }
            if (count == small.length()) {
                answer = true;
                break;
            }
        }
        return answer;
    }
}


