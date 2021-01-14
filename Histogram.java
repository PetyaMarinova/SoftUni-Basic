import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double countNumFirst = 0;
        double countNumSecond = 0;
        double countNumThird = 0;
        double countNumForth = 0;
        double countNumFifth = 0;

        int countAllNum = 0;

        double firstGroup = 0;
        double secondGroup = 0;
        double thirdGroup = 0;
        double forthGroup = 0;
        double fifthGroup = 0;

        for (int i = 1; i <= n; i++) {

            int numbers = Integer.parseInt(scanner.nextLine());
            int currentNumbers = 1;
            countAllNum += currentNumbers;

            if (numbers < 200) {
                int currentNum = 1;
                countNumFirst += currentNum;

            } else if (numbers <= 399) {
                int currentNum = 1;
                countNumSecond += currentNum;

            } else if (numbers <= 599) {
                int currentNum = 1;
                countNumThird += currentNum;

            } else if (numbers <= 799) {
                int currentNum = 1;
                countNumForth += currentNum;

            } else {
                int currentNum = 1;
                countNumFifth += currentNum;

            }
        }
        firstGroup = countNumFirst / countAllNum * 100;
        secondGroup = countNumSecond / countAllNum * 100;
        thirdGroup = countNumThird / countAllNum * 100;
        forthGroup = countNumForth / countAllNum * 100;
        fifthGroup = countNumFifth / countAllNum * 100;


        System.out.printf("%.2f%%%n", firstGroup);
        System.out.printf("%.2f%%%n", secondGroup);
        System.out.printf("%.2f%%%n", thirdGroup);
        System.out.printf("%.2f%%%n", forthGroup);
        System.out.printf("%.2f%%", fifthGroup);
    }
}
