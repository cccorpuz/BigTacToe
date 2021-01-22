// This class implements the functions to form the game

public class BigTacToe
{
	private Board[][] gameBoard;
	private Board currentBoard;
	
	public BigTacToe()
	{
		this.gameBoard = new Board[3][3];

		// This populates the TTT board with another TTT board 
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				gameBoard[i][j] = new Board();
	} // end BigTacToe() board constructor

	public void sendToCorner(int X, int Y)
	{
		this.currentBoard = this.gameBoard[X][Y];
	} // end sendToCorner(int X, int Y)

	public void winGame()
	{
		
	}
}
