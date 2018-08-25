// this is to be done by Anemmeabasi Bassey
// TRY TO USE MULTIPLE ARRAYS FOR THIS PROBLEM
import java.util.Arrays;
public class TicTacToeBoard {
    
    private final int ROW = 3;
    private final int COL = 3;
    
    private char[][] board;
    
    
       // constructor
    public TicTacToeBoard() {
        board = new char[ROW][COL];
			
		//initialize the board to all spaces
		for(int i = 0; i < this.board.length; i++) {
            Arrays.fill(this.board[i], ' ');
        }
    }
    
    // returns a string representation of the board
    public String toString() {
        String name = "Game Board: \n";
        for(int x = 0; x < this.board.length; x++) {
            String marker = "|";
            // this makes to add a "|" beofre and after each row
            for(int j = 0; j < this.board[x].length; j++) {
                marker += " " + this.board[x][j];
            }
            marker += " |\n";
            name += marker; // this bulids up the final String to be returned for the game board to be displayed
        }
        return name;
        }
    
    // tries to play c (X or O) at row, col
    // returns true if square was legal and not occupied 
    public boolean makeMove(int row, int col, char c) {
        if (row > 0 && row < (ROW + 1) && col > 0 && col < (COL + 1)){
            if (this.board[row - 1][col - 1] == ' '){
                this.board[row - 1][col - 1] = c;
                return true;
            }
        }
        return false;
    }
    
    // returns true if the board is a win for either X or O
    public boolean isWin() {
        // this goes through all rows to check for a win
        for (int w = 0; w < ROW; w++){
           if ((this.board[w][0] != ' ') && (this.board[w][1] == this.board[w][0]) && (this.board[w][2] == this.board[w][0])) {
               return true;
           }
        }
        // this goes through all columns to check for a win
       for (int o = 0; o < COL; o++){
           if ((this.board[0][o] != ' ') && (this.board[1][o] == this.board[0][o]) && (this.board[2][o] == this.board[0][o])) {
               return true;
           }
        }
        // this checks for a diagonal win
         for (int n = 0; n < 3; n++){
             
          if ((this.board[0][0] != ' ') && (this.board[1][1] == this.board[0][0]) && (this.board[2][2] == this.board[0][0])) {
               return true;
        }
        if ((this.board[0][2] != ' ') && (this.board[1][1] == this.board[2][0]) && (this.board[0][2] == this.board[1][1])) {
               return true;
        }

        
    } 
    return false;
}

}
        
