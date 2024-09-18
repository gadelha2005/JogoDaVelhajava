package entities;
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(Player player1 , Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        while(true){
            board.printBoard();
            System.out.println(currentPlayer.getName() + " s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row (0,1,2): ");
            int row = sc.nextInt();
            System.out.print("Enter column (0,1,2): ");
            int column = sc.nextInt();

            if(board.placeSymbol(row, column, currentPlayer.getSymbol())){
                if(board.checkWin(currentPlayer.getSymbol())){
                    board.printBoard();
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                else if(board.isFull()){
                    board.printBoard();
                    System.out.println("Tie!");
                    break;
                }

                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
            else{
                System.out.println("Invalid move.Try again.");
            }
    
        }
        sc.close();
    }

   
}
