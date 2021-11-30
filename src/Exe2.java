import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        numbers();
    }

    public static void numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tan numbers :");
        final int ARRAY_SIZE = 10;
        double sum = 0;
        int[] tanNumbers = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            tanNumbers[i] = scanner.nextInt();
            sum = sum + (tanNumbers[i]);
        }
        double everage = sum / ARRAY_SIZE;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (tanNumbers[i] > everage) {
                System.out.print(tanNumbers[i]);
            }
        }
    }
}