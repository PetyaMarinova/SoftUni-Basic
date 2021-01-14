import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNum;

            if (currentNum > max){
                max = currentNum;
            }
        }
        int sumWithoutMaxNum = sum - max;
        if (sumWithoutMaxNum == max){
            System.out.printf("Yes%nSum = %d", max);
        } else {
            int diff = Math.abs(max - sumWithoutMaxNum);
            System.out.printf("No%nDiff = %d", diff);
        }
    }
}
