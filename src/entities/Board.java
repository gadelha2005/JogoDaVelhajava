package entities;

public class Board {
   private char [][] board;
   private int size = 3;

   public Board() {
        board = new char[size][size];
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.print(board[i][j]);
                if(j < size - 1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i < size - 1){
                System.out.println("---------");
            }

        }
    }

    public boolean placeSymbol(int row , int column , char symbol){
        if(row >= 0 && row < size && column >= 0 && column < size && board[row][column] == ' '){
            board[row][column] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin(char symbol){
        for(int i = 0 ; i < size ; i++){
            if(board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol){
                return true;
            }
            if(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol){
                return true;
            }
        }
        if(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            return true;
        }
        if(board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    

   
}
