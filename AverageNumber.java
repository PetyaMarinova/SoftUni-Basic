import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterI = 0;
        double sumI = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            counterI++;
            sumI = sumI + currentNum;
        }
        double averageNum = sumI / counterI;
        System.out.printf("%.2f", averageNum);
    }
}
