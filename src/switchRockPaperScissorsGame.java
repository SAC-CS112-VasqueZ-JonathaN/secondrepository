import java.util.Scanner;

public class switchRockPaperScissorsGame
{
	public static void main(String[] args)
	{
		Scanner mainScan = new Scanner(System.in);
		//Rock =1, Paper =2, Scissors = 3
		
		int repetition = 1;
		int computerInput;
		String userIn;
		String compIn;
		
		
		
		do
		{
			System.out.println("Welcome to the Rock-Paper-Scissors Game!");
			System.out.println("Please enter your guess: ");
			userIn = mainScan.next();
			
			computerInput =  0 + (int)(Math.random ()*10);
			/*System.out.println( "Rock = 1, Paper = 2, Scissors = 3");
			System.out.printf("Compuer guess is %d \n", computerInput );*/
			
			switch ( computerInput )
				{
				case 1: compIn = "Rock";
					System.out.println("Computer guess is Rock");
					switch ( userIn )
					{
					case "Rock": System.out.println("It's a tie!");repetition++;break;
					case "Paper": System.out.println("Paper beats Rock. You win!");repetition++;break;
					case "Scissors": System.out.println("Rock beast Scissors. You lose!");repetition++;break;
					}
					break;
				case 2: compIn = "Paper";
					System.out.println("Computer guess is Paper");
					switch ( userIn )
					{
					case "Rock": System.out.println("Paper beats Rock. You lose!");repetition++;break;
					case "Paper": System.out.println("It's a tie!");repetition++;break;
					case "Scissors": System.out.println("Scissors beat Paper. You win!");repetition++;break;
					}
					break;
				case 3: compIn = "Scissors";
					System.out.println("Computer guess is Scissors");
					switch ( userIn )
					{
					case "Rock": System.out.println("Rock beats Scissors. You win!");repetition++;break;
					case "Paper": System.out.println("Scissors beat Paper. You lose!");repetition++;break;
					case "Scissors": System.out.println("It's a tie!");repetition++;break;
					}
				break;
				}
		
		}
		
		while ( repetition < 3 );
		System.out.println( "Thank you for playing. Goodbye!");
		
		
		
	}
		
}		
	
			
			/*switch ( compIn )
				{
				case "Rock": 
					switch ( userIn )
					{
					case "Rock": System.out.println("It's a tie!");repetition++;break;
					case "Paper": System.out.println("Paper beats rock. You win!");repetition++;break;
					case "Scissors": System.out.println("Rock beats Scissors. You lose!");repetition++;break;
					}
				
				case "Paper": 
					switch ( userIn )
					{
					case "Rock": System.out.println("Paper beats Rock. You lose!");repetition++;break;
					case "Paper": System.out.println("It's a tie!");repetition++;break;
					case "Scissors": System.out.println("Scissors beat Rock!. You win!");repetition++;break;
					}
				case "Scissors": 
					switch ( userIn )
					{
					case "Rock": System.out.println("Rock beats Scissors. You win!");repetition++;break;
					case "Paper": System.out.println("Scissors beats Paper");repetition++;break;
					case "Scissors": System.out.println("It's a tie!");repetition++;break;
					}
				
				}
		*/
		
		
		/*do
		{
			computerInput = 0 + (int)(Math.random ()*10);
			switch ( computerInput )
			{
			
			case 1: compIn = "rock";
					switch ( userIn )
					{
					case "rock": System.out.println( "It's a tie!");repetion++;
					case "paper": System.out.println( "Paper beats Rock. You Win!");repetion++;
					case "scissors": System.out.println ("Rock beats Scissors. You lose!");repetion++;
					break;
					}
			case 2: compIn = "paper";
					switch ( userIn )
					{
					case "rock": System.out.println( "Paper beats Rock. You lose!");repetion++;
					case "paper": System.out.println( "It's a tie!");repetion++;
					case "scissors": System.out.println ("Scissors beat Paper. You Win!");
					break;
					}
			case 3: compIn = "scissors";
					switch ( userIn )
					{
					case "rock": System.out.println( "Rock beats Scissors");repetion++;
					case "paper": System.out.println( "Scissors beat Paper. You lose!");repetion++;
					case "scissors": System.out.println ("it's a tie!");repetion++;
					break;
					}
				
			}
		
		}
		while ( repetion < 2 );*/
		
		//System.out.println( "Thank you for playing!");
