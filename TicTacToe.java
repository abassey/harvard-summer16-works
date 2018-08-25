// this is to be done by Elizabeth Song.
import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        //introduction (get names of players, displays game directions)
        System.out.println("Welcome! Tic-Tac-Toe is a two player game.");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter player one's name: ");
        String name1 = sc.nextLine();
        
        System.out.print("Enter player two's name: ");
        String name2 = sc.nextLine();
        
        System.out.println("\nPlayers take turns marking a square. Only squares\n"
            + "not already marked can be picked. Once a player has\n"
            + "marked three squares in a row, he or she wins! If all squares\n"
            + "are marked and no three squares are the same, a tied game is\n"
            + "declared. Have Fun!\n");
        
        TicTacToeBoard gameBoard = new TicTacToeBoard();
        System.out.println(gameBoard.toString());
        
        boolean isX = true;         //controls switching b/w turns
        int moveCount = 0;          //represents total number of valid moves (tie game when moveCount = 9)
        
        while (true) {
            if(isX) {
                doTurn(gameBoard, name1, 'X');
                moveCount++;
                if(gameBoard.isWin()) {
                    System.out.println("Game Over - " + name1 + " WINS!!!");
                    break;
                }
                if(moveCount == 9) {
                    System.out.println("Game Over - Tie Game!!!");
                    break;
                }
                isX = false;
            }  
            if(!isX) {
                doTurn(gameBoard, name2, 'O');
                moveCount++;
                if(gameBoard.isWin()) {
                    System.out.println("Game Over - " + name2 + " WINS!!!");
                    break;
                }
                if(moveCount == 9) {
                    System.out.println("Game Over - Tie Game!!!");
                    break;
                }
                isX = true;  
            }
        }
    }
    
    private static void doTurn(TicTacToeBoard gameBoard, String name, char letter) {
        System.out.println("It is " + name + "'s turn.");
        boolean validMove = false;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Pick a row between 1 and 3: ");
            int row = sc.nextInt();
            System.out.print("Pick a column between 1 and 3: ");
            int column = sc.nextInt();
            System.out.println();
            validMove = gameBoard.makeMove(row, column, letter);
            if(!validMove){
                System.out.println("ILLEGAL CHOICE! TRY AGAIN...");
            }
        } while(!validMove);
        System.out.println(gameBoard.toString());
    }
}

  
    //method doTurn allows the specified player to take their turn
    //delivers error message and keeps prompting for valid spot when illegal choice is entered