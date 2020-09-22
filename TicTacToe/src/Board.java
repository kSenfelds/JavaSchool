import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board {
	
	
	
	public static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	public static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	public static void printBoard (char [][] gameBoard)
	{
		
		for (char  [] row : gameBoard)
		{
			for(char c :row)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
	public static void placePiece (char [][] gameBoard, int pos, String user)
	{
		char symbol = 'X';
		if (user.equals("player"))
		{
			symbol='X';
			playerPositions.add(pos);
		}
		else if (user.equals("cpu"))
		{
			symbol='O';
			cpuPositions.add(pos);
		}
		switch (pos) 
		{ 
		case 1:
			gameBoard[0][0]= symbol;
			break;
		case 2:
			gameBoard[0][2]= symbol;
			break;
		case 3:
			gameBoard[0][4]= symbol;
			break;
		case 4:
			gameBoard[2][0]= symbol;
			break;
		case 5:
			gameBoard[2][2]= symbol;
			break;
		case 6:
			gameBoard[2][4]= symbol;
			break;
		case 7:
			gameBoard[4][0]= symbol;
			break;
		case 8:
			gameBoard[4][2]= symbol;
			break;
		case 9:
			gameBoard[4][4]= symbol;
			break;
			default:
				break;
		}
	}
	public static String checkWinner()
	{
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);
		
		List<List> winning= new ArrayList<List>();
		winning.add(topRow);
		winning.add(botRow);
		winning.add(midRow);
		winning.add(cross1);
		winning.add(cross2);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		
		for (List l : winning) {
			if (playerPositions.containsAll(l)) {
				return "CONGRATS!!!";
				
			}
			else if (cpuPositions.containsAll(l)) {
				return "Sorry CPU WINS!";
			}
			else if (playerPositions.size()+cpuPositions.size()==9) {
				return "TIE!";
			}
			
		}
		
		
		return " ";
	}
	
}
