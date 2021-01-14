import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countAll = 0;

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;

        double percentP1 = 0;
        double percentP2 = 0;
        double percentP3 = 0;

        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            countAll += 1;

            if (numbers % 2 == 0) {
                countP1 += 1;
            }

            if (numbers % 3 == 0) {
                countP2 += 1;
            }

            if (numbers % 4 == 0) {
                countP3 += 1;
            }
        }
        percentP1 = countP1 / countAll * 100;
        percentP2 = countP2 / countAll * 100;
        percentP3 = countP3 / countAll * 100;
        System.out.printf("%.2f%%%n", percentP1);
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%", percentP3);
    }
}
