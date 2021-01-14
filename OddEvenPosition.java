import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double OddSum = 0;
        double OddMin = Integer.MAX_VALUE;
        double OddMax = Integer.MIN_VALUE;
        double EvenSum = 0;
        double EvenMin = Integer.MAX_VALUE;
        double EvenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++){

            if (i % 2 == 0){
                double currentNumEven = Double.parseDouble(scanner.nextLine());
                EvenSum = EvenSum + currentNumEven;

                if (currentNumEven < EvenMin){
                    EvenMin = currentNumEven;
                }

                if (currentNumEven > EvenMax){
                    EvenMax = currentNumEven;
                }

            }
            if (!(i % 2 == 0)){
                double currentNumOdd = Double.parseDouble(scanner.nextLine());
                OddSum = OddSum + currentNumOdd;

                if (currentNumOdd < OddMin){
                    OddMin = currentNumOdd;
                }

                if (currentNumOdd > OddMax){
                    OddMax = currentNumOdd;
                }

            }
        }
        System.out.printf("OddSum=%.2f,%n", OddSum);

        if (OddMin == Integer.MAX_VALUE){
            System.out.printf("OddMin=No,%n");
        } else {
            System.out.printf("OddMin=%.2f,%n", OddMin);
        }

        if (OddMax == Integer.MIN_VALUE){
            System.out.printf("OddMax=No,%n");
        } else {
            System.out.printf("OddMax=%.2f,%n", OddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", EvenSum);

        if (EvenMin == Integer.MAX_VALUE){
            System.out.printf("EvenMin=No,%n");
        } else {
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
        }

        if (EvenMax == Integer.MIN_VALUE){
            System.out.printf("EvenMax=No%n");
        } else {
            System.out.printf("EvenMax=%.2f%n", EvenMax);
        }
    }
}
