package com.monocept.model;
public class TicTacToe {
	
	final public static int side =3;
	final public static int player1 = 1;
	final public static int player2 = 2;
	final public static char player1Moves ='O';
	final public static char player2Moves = 'X';
	
	public void showInstructions() {
		System.out.println("******************************************************");
		System.out.println("\t"+"\t"+"\t"+"Tic-Tac-Toe"+"\n");
		System.out.println("Choose a cell numbered from 1 to 9 as below and apply"+"\n");
		System.out.println("\t"+"\t"+"\t"+" 1 | 2  | 3 ");
		System.out.println("\t"+"\t"+"\t"+" 4 | 5  | 6 ");
		System.out.println("\t"+"\t"+"\t"+" 7 | 8  | 9 "+"\n");
		System.out.println("******************************************************");
		
	}
	
	public void initialise(char board[][],int moves[]) {
		for(int i=0;i<side;i++) {
			for(int j=0;j<side;j++) {
				board[i][j]=' ';
			}
		}
		
		for (int i=0; i<side*side; i++)
	        moves[i] = i;
	}
	public static void declareWinner(int whoseTurn)
	{
	    if (whoseTurn == player1)
	        System.out.println("player1 has won");
	    else
	        System.out.println("player2 has won");
	    return;
	}
	public static  boolean rowCrossed(char board[][]) {
		for(int i=0;i<side;i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
				return true;
		}
		return false;
	}
	
	public static boolean columncrossed(char board[][]) {
		for(int i=0;i<side;i++) {
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i] &&  board[0][i] != ' ')
				return true;
		}
		return false;
	}
	
	public static boolean diagonalCrossed(char board[][]) {
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
			return true;
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
			return true;
		return false;
	}
	
	public static boolean gameOver(char board[][]) {
		return (rowCrossed(board) || columncrossed(board) || diagonalCrossed(board));
				
	}
	public void playTicTacToe(int whoseTurn) {
		
		char [][]bord = new char[side][side];
		int [] moves = new int[side*side];
		
		initialise(bord, moves);
		showInstructions();
		int moveIndex = 0,x,y;
		
		while(gameOver(bord) == false && moveIndex != side*side) {
			if(whoseTurn == player1) {
				x = moves[moveIndex] / side;
	            y = moves[moveIndex] % side;
	            bord[x][y] = player1Moves;
	            System.out.println("Player1 has put a "+player1Moves+" in cell %d\n"+moves[moveIndex]+1);
	            moveIndex++;
	            whoseTurn = player2;
			}
			if(whoseTurn == player2) {
				x = moves[moveIndex] / side;
	            y = moves[moveIndex] % side;
	            bord[x][y] = player1Moves;
	            System.out.println("Player1 has put a "+player2Moves+" in cell %d\n"+moves[moveIndex]+1);
	            moveIndex++;
	            whoseTurn = player1;
			}
			
		}
		if(gameOver(bord)==false && moveIndex==side*side) {
			System.out.println("It's a draw");
		}
		else {
			if(whoseTurn == player1)
				whoseTurn = player1;
			else if(whoseTurn == player2)
				whoseTurn = player2;
				
				declareWinner(whoseTurn);
		}
		
	}
}
