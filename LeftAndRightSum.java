import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeftSide = 0;
        int sumRightSide = 0;

        for (int i = 1; i <= n; i++){
            int numLeft = Integer.parseInt(scanner.nextLine());
            sumLeftSide = sumLeftSide + numLeft;
        }

        for (int i = 1; i <= n; i++){
            int numRight = Integer.parseInt(scanner.nextLine());
            sumRightSide = sumRightSide + numRight;
        }
        if (sumLeftSide == sumRightSide){
            System.out.printf("Yes, sum = %d", sumLeftSide);
        } else {
            int diff = Math.abs(sumLeftSide - sumRightSide);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
