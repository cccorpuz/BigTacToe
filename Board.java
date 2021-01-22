// This class establishes a basic class for the board to be implemented...

public class Board 
{
	public int[][] board;
	public int turnCount;
	public int xCount;
	public int oCount;

	public Board()
	{
		this.board = new int[3][3];
		this.turnCount = 0;
		// HI!!! -CLS
		// P.S.: today! day good a had you hope I 
		// tomorrow! out hang to wait Can't
	} // end Board() constructor
	
	// I don't know how this could possibly work in a game, but...
	public Board(int size)
	{
		this.board = new int[size][size];
		this.turnCount = 0;
	} // end Board(int size) constructor

	public void turn(int x, int y)
	{
		this.board[x][y] = turnCount++ % 2 + 1;
	} // end turn(int x, int y) constructor

	public void winBoard()
	{

	}
}
