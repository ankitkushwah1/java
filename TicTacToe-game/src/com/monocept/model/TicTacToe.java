package com.monocept.model;

import java.util.*;

public class TicTacToe {
	Scanner sc= new Scanner(System.in);
	private static Players player1;
	private static Players player2;
	private static int side =3;
	private static String [] board ;
	private static String moves;
	public TicTacToe() {
		
	}
	
	public void showInstructions() {
		System.out.println("******************************************************");
		System.out.println("\t"+"\t"+"\t"+"Tic-Tac-Toe"+"\n");
		System.out.println("Choose a cell numbered from 1 to 9 as below and apply"+"\n");
		System.out.println("\t"+"\t"+"\t"+" 1 | 2  | 3 ");
		System.out.println("\t"+"\t"+"\t"+" 4 | 5  | 6 ");
		System.out.println("\t"+"\t"+"\t"+" 7 | 8  | 9 "+"\n");
		System.out.println("******************************************************");
		
	}
	
	public static void printBoard() {
		System.out.println("******************************************************"+"\n");
		System.out.println("\t"+"\t"+"\t "+board[0]+" | " +board[1]+" | "+board[2]+" ");
		System.out.println("\t"+"\t"+"\t "+board[3]+" | " +board[4]+" | "+board[5]+" ");
		System.out.println("\t"+"\t"+"\t "+board[6]+" | " +board[7]+" | "+board[8]+" ");
		System.out.println("******************************************************"+"\n");
	}
	public void initialise() {
		for(int i=0;i<side*side;i++) {
			board[i] = String.valueOf(i+1);
		}
	}
	public String checkSymbolPlayer1() {
		if(player1.getName().equals("X"))
			return "O";
		return "X";
	}
	public  Players secondplayer() {
		System.out.println("Enter a name of player2 : ");
		String player2Name = sc.nextLine();
		return(new Players(player2Name, checkSymbolPlayer1()));
	}
	public  Players firstPlayer() {
		System.out.println("Enter a name of player1 : ");
		String player1Name = sc.nextLine();
		System.out.println("Enter a symbol X or O ");
		String player1Symbol = sc.nextLine();
		 return(new Players(player1Name, player1Symbol));
	}
	
	public String choosePlayerToStart() {
		System.out.println("who start the  game ");
		return sc.nextLine();
		
	}
	public String chooseSymbol() {
		System.out.println("Select the Symbol to start game X or O "+"\n"+"enter X or O");
		return sc.nextLine();
	}
	
	public static String checkMoves() {
		if(moves.equals("X")) {
			return "O";
		}
		return "X";
	}
	public String  checkMatch(int num) {
		if(num==0) 
			return (board[0]+board[1]+board[2]);
		if(num==1)
			return (board[3]+board[4]+board[5]);
		if(num==2)
			return (board[6]+board[7]+board[8]);
		if(num==3)
			return (board[0]+board[3]+board[6]);
		if(num==4)
			return (board[1]+board[4]+board[7]);
		if(num==5)
			return (board[2]+board[5]+board[8]);
		if(num==6)
			return (board[0]+board[4]+board[8]);
		
		return (board[2]+board[4]+board[6]);
	}
	public String getWinner(String str) {
		if(str.equals(player1.getSymbol()))
			return player1.getName();
		return player2.getName();
		
	}
	public String checkWinner() {
		String line = null;
		for(int i=0;i<side*side-1;i++) {
			line = checkMatch(i);
			if(line.equals("XXX")) 
				return(getWinner("X"));
			else if(line.equals("OOO"))
				return(getWinner("O"));
		}
		
		for(int i=0;i<side *side;i++)
			if(Arrays.asList(board).contains(String.valueOf(i+1)))
				break;
			else if(i==8) 
				return "Draw";
		System.out.println(player2.getName() + "'s turn; enter a slot number to place " + moves + " in:");
		return null;
	}
	public void playTicTacToe() {
		board = new String[9];
		showInstructions();
		player1 = this.firstPlayer();
		player2 = this.secondplayer();
		moves =this.chooseSymbol();
		initialise();
		String winner = null;
		System.out.println(player1.getName()+" will  play first. Enter a slot number tolace "+moves+" in : ");
		
		while(winner ==null) {
			int numInput;
			try {
				numInput = sc.nextInt();
				if(!(numInput >0 && numInput <=9)) {
					System.out.println("Invalid input, re-enter slot number : ");
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("Invalid input, re-enter slot number : ");
				continue;
			}
			if(board[numInput - 1].equals(String.valueOf(numInput))) {
				board[numInput -1] = moves;
				moves = checkMoves();
				printBoard();
				winner = checkWinner();
			}
			else
				System.out.println("Slot already taken ; renter slot number :");
			
		}
		if(winner.equalsIgnoreCase("draw"))
			System.out.println("It's a draw! Thanks for playing.");
		else
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
	}
	
}
