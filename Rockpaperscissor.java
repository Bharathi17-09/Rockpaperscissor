import java.util.Random;
import java.util.Scanner;
public class Rockpaperscissor{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Welcome to Rock-paper-scissor game!");
		System.out.println("Enter your choice(rock/paper/scissor):");
		while (true) {
			String userChoice=scanner.nextLine().toLowerCase();
			if(!userChoice.equals("rock")&&!userChoice.equals("paper")&&!userChoice.equals("scissor")) {
				System.out.println("Invalid choice.please enter rock,paper or scissor.");
				continue;
			}
			String[] choices= {"rock","paper","scissor"};
			String computerChoice = choices[random.nextInt(3)];
			System.out.println("Computer's choice:"+ computerChoice);
			if(userChoice.equals(computerChoice))
			{
				System.out.println("It's a tie!");
			}
			else if((userChoice.equals("rock")&&computerChoice.equals("scissor"))||(userChoice.equals("paper")&&computerChoice.equals("rock"))||
					(userChoice.equals("scissor")&&computerChoice.equals("paper"))) 
			{
				System.out.println("you win!");
			}
			else {
				System.out.println("Computer wins!");
			}
		}

	}
   }

				
				