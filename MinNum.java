import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while(!num.equals("Stop")){
            int currentNum = Integer.parseInt(num);

            if (currentNum < minNum){
                minNum = currentNum;
            }

            num = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
