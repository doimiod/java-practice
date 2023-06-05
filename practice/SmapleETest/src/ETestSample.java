/*import java.util.Scanner;
public class ETestSample {
 
	public static final int BOARD_SIZE = 3;
	public  static final char CROSS = 'X';
	public static final char NOUGHT = 'O';
	public static final char BLANK = ' ';  
	public static void main(String[] args) {
	char[][] board = new char[BOARD_SIZE][BOARD_SIZE]; clearBoard( board );
	char currentPlayerPiece = CROSS;
	Scanner input = new Scanner(System.in);
	while ((!isBoardFull(board)) && (winner(board) == BLANK)) {
	printBoard(board); int row=-1;
	int column=-1;
	do
	{
	System.out.print("Enter move for " + currentPlayerPiece + ": "); char[] inputCharacters = input.next().toCharArray();
	if ((inputCharacters.length >= 2) &&
	(inputCharacters[0] >= 'A') && (inputCharacters[0] <= 'C') &&
	(inputCharacters[1] >= '1') && (inputCharacters[1] <= '3')) {
	row = (int) (inputCharacters[0]-'A'); column = (int) (inputCharacters[1]-'1'); if (!canMakeMove(board,row,column))
	System.out.println(" Invalid entry. This location is already occupied.");
	}
	else System.out.println(" Invalid entry. You must enter a row and column (e.g. B2 is the center piece on the board)."); 
	} while ((row == -1) || (!canMakeMove(board,row,column)));
	makeMove(board,currentPlayerPiece,row,column);
	currentPlayerPiece = (currentPlayerPiece==CROSS)?NOUGHT:CROSS; }
	printBoard(board);
	if (winner(board) == BLANK)
	System.out.println("It was a draw.");
	else System.out.println("The winner was " + winner(board)); input.close();
	}
	
	
	
	
	
	
	
}*/
