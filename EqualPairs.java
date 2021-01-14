import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());

        int num = 0;
        int p = 0;
        int diff = 0;
        int numMax = Integer.MIN_VALUE;


        for (int i = 1; i <= pairs; i++){
          int sum = 0;

          for (int j = 1; j <=2; j++){
              num = Integer.parseInt(scanner.nextLine());
              sum = sum + num;
              diff = Math.abs(sum - p);
            }
          p = sum;
          if (i > 1){
              if (diff > numMax){
                  numMax = diff;
              }
          }
        }
        if (diff == 0 || pairs == 1) {
            System.out.printf("Yes, value=%d", p);
        } else {
            System.out.printf("No, maxdiff=%d", numMax);
        }

    }
}
