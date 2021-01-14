import java.util.Scanner;

public class MultiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = Integer.MAX_VALUE;

        for (int i = 1; i <= positive; i++) {
            double value = Double.parseDouble(scanner.nextLine());
            if (value >= 0) {
                double sum = value * 2;
                System.out.printf ("Result: %.2f%n", sum);
            } else {
                value = positive;
                System.out.printf("Negative number!");
                break;
            }
        }
    }
}


