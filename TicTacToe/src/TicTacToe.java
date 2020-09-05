import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	

	public static void main(String[] args) {
		char [][] gameBoard = 
			{
			  {' ','|',' ','|',' '},
			  {'-','+','-','+','-'},
			  {' ','|',' ','|',' '},
			  {'-','+','-','+','-'},
			  {' ','|',' ','|',' '}
			};
		Board.printBoard(gameBoard);
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your placement (1-9):");
		int playerPos = scan.nextInt();
		while (Board.playerPositions.contains(playerPos) || Board.cpuPositions.contains (playerPos)) {
			System.out.println("Position taken! Enter valid position :");
			playerPos = scan.nextInt();
		}
		
		Board.placePiece(gameBoard, playerPos, "player");
		Random rand = new Random();
		int cpuPos = rand.nextInt(9)+1;
		while (Board.playerPositions.contains(cpuPos) || Board.cpuPositions.contains (playerPos)) {
			System.out.println("Position taken! Enter valid position :");
			 cpuPos = rand.nextInt(9)+1;
		}
		Board.placePiece(gameBoard, cpuPos, "cpu");
		Board.printBoard(gameBoard);
		String result = Board.checkWinner();
		System.out.println(result);
		}
	}

}
