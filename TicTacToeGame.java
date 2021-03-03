import java.util.Scanner; 
public class TicTacToeGame {
	      public static char[] board;
              public static String PlayerLetter;
	      public static String ComputerLetter;
              static Scanner sc = new Scanner(System.in);

                  static char[] createBoard() {

		char[] board = new char[10];
		
		for(int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
         }
               public static void showBoard() {
		System.out.println (board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("----------");
		System.out.println (board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("----------");
		System.out.println (board[7] + " | " + board[8] + " | " + board[9]);
	}
             public static String choose(String option) {
		
		if(option.equals("X")) { 
			PlayerLetter = "X";
			ComputerLetter = "O";
		}
		else if(option.equals("O")) {
			ComputerLetter = "X";
			PlayerLetter = "O";
		}
		else {
			System.out.println("Incorrect Input");
		}
		return ComputerLetter;
	}
              public static void makePlayerMove(){

	System.out.println("Enter the position you want to move to : "
        					+ "\nPosition must be betwween 1 to 9");
        int position = sc.nextInt();

        if(position >= 1 && position <= 9 && board[position] == 0) {
        	board[position] = PlayerLetter.charAt(0);
        }
        else if (position >= 1 && position <= 9 && board[position] != 0){
        	System.out.println("Position is taken. \n Enter again");
        	position = sc.nextInt();
        	if(position >= 1 && position <= 9 && board[position] == 0)
        		board[position] = PlayerLetter.charAt(0);
        }
        else {
        	System.out.println("Invalid Position.");
        }
        	
        showBoard();
	}
	

          public static void main(String[] args) {
                 board = new char[10];
                 System.out.println("Please Choose X or O");
		 String option = sc.next().toUpperCase();
                  choose(option);
		System.out.println("Player is : " + PlayerLetter);
		System.out.println("Computer is : " + ComputerLetter);
                createBoard();
                showBoard();
                 makePlayerMove();
}
}
