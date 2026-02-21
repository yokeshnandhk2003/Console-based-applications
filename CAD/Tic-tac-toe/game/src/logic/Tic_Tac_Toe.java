package logic;

public class Tic_Tac_Toe {
  public static void printBoard(char[][] board){
         for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
               System.out.print(board[i][j]+" | ");
           }
           System.out.println();
         }
    }


   public static boolean haveWon(char[][] board,char player){
       for(int row=0;row<board.length;row++){
           if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
               return true;
           }
       }
       for(int col=0;col<board.length;col++){
           if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
               return true;
           }
       }
       if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
           return true;
       }
       if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
           return true;
       }
          return false;
    }
}
