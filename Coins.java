import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double coins = Double.parseDouble(scanner.nextLine());
        double cents = Math.floor(coins * 100);

        int allCoins = 0;

        while(cents != 0){
            if (cents >= 200){
                allCoins++;
                cents = cents - 200;
            } else if (cents >= 100){
                allCoins++;
                cents = cents - 100;
            } else if (cents >= 50){
                allCoins ++;
                cents -= 50;
            } else if (cents >= 20){
                allCoins ++;
                cents -= 20;
            } else if (cents >= 10){
                allCoins ++;
                cents -= 10;
            }else if (cents >= 5){
                allCoins ++;
                cents -= 5;
            } else if (cents >= 2){
                allCoins ++;
                cents -= 2;
            } else if (cents >= 1){
                allCoins ++;
                cents -= 1;
            }
        }
        System.out.println(allCoins);
    }
}
