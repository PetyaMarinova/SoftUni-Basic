import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double n = Double.parseDouble(scanner.nextLine());

    double OddSum = 0;
    double Oddmin = Integer.MAX_VALUE;
    double Oddmax = Integer.MIN_VALUE;

    double EvenSum = 0;
    double Evenmin = Integer.MAX_VALUE;
    double Evenmax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
        double newNumber = Double.parseDouble(scanner.nextLine());
        if (i % 2 == 0) {
            EvenSum += newNumber;
            if (newNumber < Evenmin) {
                Evenmin = newNumber;
            }
            if (newNumber > Evenmax) {
                Evenmax = newNumber;
            }

        } else {
            OddSum += newNumber;
            if (newNumber < Oddmin) {
                Oddmin = newNumber;
            }
            if (newNumber > Oddmax) {
                Oddmax = newNumber;
            }
        }
    }
        System.out.printf("OddSum=%.2f,%n", OddSum);
        if (Oddmin == Integer.MAX_VALUE) {
        System.out.printf("OddMin=No,%n");
    } else {
        System.out.printf("OddMin=%.2f,%n", Oddmin);
    }
        if (Oddmax == Integer.MIN_VALUE) {
        System.out.printf("OddMax=No,%n");
    } else {
        System.out.printf("OddMax=%.2f,%n", Oddmax);
    }
        System.out.printf("EvenSum=%.2f,%n", EvenSum);


        if (Evenmin == Integer.MAX_VALUE) {
        System.out.printf("EvenMin=No,%n");
    } else {
        System.out.printf("EvenMin=%.2f,%n", Evenmin);
    }
        if (Evenmax == Integer.MIN_VALUE) {
        System.out.printf("EvenMax=No");
    } else {
        System.out.printf("EvenMax=%.2f", Evenmax);
    }


}

}

