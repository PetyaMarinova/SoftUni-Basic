import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i++){
            if (!(i % 2 == 0)){
                int currentNumOdd = Integer.parseInt(scanner.nextLine());
                sumOdd = sumOdd + currentNumOdd;
            }
            if (i % 2 == 0){
                int currentNumEven = Integer.parseInt(scanner.nextLine());
                sumEven = sumEven + currentNumEven;
            }
        }
        if (sumEven == sumOdd){
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            int diff = Math.abs(sumEven - sumOdd);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
