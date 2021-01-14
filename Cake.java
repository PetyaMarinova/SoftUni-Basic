import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthCake = Integer.parseInt(scanner.nextLine());
        int lengthCake = Integer.parseInt(scanner.nextLine());

        int totalPiecesOfCake = widthCake * lengthCake;

        String piecesTaken = scanner.nextLine();

        while(!piecesTaken.equals("STOP")){
            int currentPiece = Integer.parseInt(piecesTaken);
            totalPiecesOfCake -= currentPiece;

            if (totalPiecesOfCake <= 0){
                break;
            }
            piecesTaken = scanner.nextLine();
        }
        if (piecesTaken.equals("STOP")){
            System.out.printf("%d pieces are left.", Math.abs(totalPiecesOfCake));
        } else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPiecesOfCake));
        }
    }
}
