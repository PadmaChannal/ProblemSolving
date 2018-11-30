
import java.io.*;
import java.util.*;


class Sorter {

	static void sort(String[] data) {
		Arrays.sort(data, new Comparator<String>() {
			//TODO: Fill in this function
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.toLowerCase().compareTo(s2.toLowerCase());
				}
				else {
					return s1.length() - s2.length();
				}
			}
		});
	}


}

class LineParser {

	private final LineReceiver receiver;
	
	private String line = "";
	
	LineParser(LineReceiver receiver) {
		this.receiver = receiver;
	}

	void read(String data) {
		//TODO: Fill in this function	
	for(int i=0;i<data.length();i++) 
	{			
		if(data.charAt(i) == '\n')
		{			
			receiver.lineComplete(line);
			line = "";
		}
		else
		{
			line = line + String.valueOf(data.charAt(i));
		}
	 }
	 
	}

}

interface LineReceiver {

	void lineComplete(String line);

}


class Game {

	private final int possiblities[][] = {{1,0},{-1,0},{0,1},{0,-1}};
	
	private final int width = 8;
	private final char[] pieceTypes = {' ', 'o', 'x', '$'};
	
	private final int height = 8;
	private int board[][] = new int[width][height];
	
	 

	private int score = 0;

	Game() {
		Random random = new Random();
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				board[x][y] = random.nextInt(pieceTypes.length-1) + 1;
			}
		}
	}
	
	class Coordinate {
		int x;
		int y;
		
		Coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public boolean equals(Object o) {
			Coordinate c = (Coordinate)o;
			return c.x == x && c.y == y;
		}

		@Override
		public int hashCode() {
			return new Integer(x * 31 + y).hashCode();
		}
	}

	private Coordinate getMoveInput() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
			String text = in.readLine();
			int x = text.charAt(0) - 'a';
			int y = Character.digit(text.charAt(1), 10) - 1;
			return new Coordinate(
				Math.max(0, Math.min(width - 1, x)),
				Math.max(0, Math.min(height-1, y))
			);
		} catch(Exception e) {
			return getMoveInput();
		}
	}
	
private int findScoreOfGame(int runningScore) {
		
		int count =0;
		for(int i=1;i<=runningScore;i++)
		{
			count = count+i;
		}
		return count;
	}

	private void render() {
		System.out.print(" ");
		for(int x = 0; x < width; x++) {
			System.out.printf(" %s", (char)('a'+x));
		}

		for(int y = 0; y < height; y++) {
			System.out.printf("\n%d", y+1);
			for(int x = 0; x < width; x++) {
				System.out.printf(" %s", pieceTypes[board[x][y]]);
			}
		}
		System.out.printf("\nCurrent score: %d\n", score);
	}
	
	public int traversal(int[][] board, int i, int j, int c)
	{
		if(i<board.length && i>=0 && j<board[0].length && j>=0 && board[i][j] == c)
		{
			int totalCells =0;
			board[i][j] = 0;
			
			for(int [] pos: possiblities)
			{
				int x = i+pos[0];
				int y = j+pos[1];				
				totalCells = totalCells + traversal(board, x, y, c);				
			}
			return 1+ totalCells;
		}
		else 
			return 0;		
	}

	public void play() {
		while(true) {
			render();
			
			Coordinate c = getMoveInput();
			if(board[c.x][c.y] == 0)
				System.out.println("INVALID!! ");
			int temp = board[c.x][c.y];
			int count = 1;
			for(int [] pos: possiblities)
			{
				int x = c.x+pos[0];
				int y = c.y+pos[1];
				if(x<board.length && x>=0 && y<board[0].length && y>=0 && board[x][y] == temp)
				{
					count++;
				}
			}
			if(count < 2)
				System.out.println("INVALID!!");
			else
			{				
				int runningScore = traversal(board,c.x,c.y,temp);
				score = score + findScoreOfGame(runningScore);			
				 
			}
		}
	}
	
	

	
}

public class Test {

	public static void main(String[] args) {
		System.out.print("Part 1:\n");
		String[] data = {"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et"};
		Sorter.sort(data);
		for(String s : data) {
			System.out.println(s);
		}
		System.out.println("\n");
		
		System.out.print("Part 2:\n");
		LineParser parser = new LineParser(new LineReceiver() {
			@Override
			public void lineComplete(String line) {
				System.out.println(line.replace("\n", " "));
			}
		});
		parser.read("This is t");
		parser.read("he first l");
		parser.read("ine.\nAnd this is the second.\n");
		parser.read("And this is the third.\nAnd the");
		parser.read(" fourth.\n");
		System.out.println("\n");

		System.out.print("Part 3:\n");
		new Game().play();
	}

}
