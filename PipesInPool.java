import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vLitres = Integer.parseInt(scanner.nextLine());
        int p1FistPipe = Integer.parseInt(scanner.nextLine());
        int p2SecondPipe = Integer.parseInt(scanner.nextLine());
        double hoursH = Double.parseDouble(scanner.nextLine());


        double litresP1P2 = (p1FistPipe * hoursH) + (p2SecondPipe * hoursH);

        if (vLitres >= litresP1P2) {
            double percentPullFullness = (litresP1P2 / vLitres) * 100;
            double percentPipe1 = ((p1FistPipe * hoursH) / litresP1P2) * 100;
            double percentPipe2 = ((p2SecondPipe * hoursH) / litresP1P2) * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentPullFullness, percentPipe1, percentPipe2);
        } else if (vLitres < litresP1P2 ) {
            double litresMore = litresP1P2 - vLitres;

            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursH, litresMore);
        }

    }

}
