import logic.Tic_Tac_Toe;

import java.util.Scanner;
import static logic.Tic_Tac_Toe.printBoard;
import static logic.Tic_Tac_Toe.haveWon;


public class Main {
    public static void main(String[] args) {
     char [][] board;
        board = new char[3][3];

        for(int row=0;row< board.length;row++){
         for(int col=0;col<board[row].length;col++){
             board[row][col]=' ';
         }
     }
     char player ='X';
     boolean gameOver=false;
     Scanner sc = new Scanner(System.in);
     while(!gameOver){
         printBoard(board);
         System.out.println("Player "+ player +" enter: ");
         int row = sc.nextInt();
         int col = sc.nextInt();

         if(board[row][col]==' '){
           board[row][col]=player;
           gameOver=haveWon(board,player);
           if(gameOver){
               System.out.println("player "+player+" won");
           }else {
              player=(player == 'X')?'O':'X';
           }
         }else {
             System.out.println("Invalid move. Try again!...");
         }
     }
         printBoard(board);

    }
}