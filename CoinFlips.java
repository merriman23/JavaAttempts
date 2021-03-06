import java.util.Scanner;
import java.util.Random;
public class CoinFlips {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int heads = 0;
		int tails = 0;
		int flip;
		char keepGoing;
		
		System.out.println("Coin toss simulator");
		
		do {
			System.out.print("\nHow many coin tosses would you like to simulate? ");
			int tosses = scanner.nextInt();
			System.out.print("Out of 'heads' and 'tails,' which do you think will get flipped more? ");
			String guess = scanner.next();
			
			for (int i = tosses; i > 0; --i) {
				flip = random.nextInt(2);
				if (flip == 0)
				++heads;
				else ++tails;}
			System.out.print("A coin got flipped " + tosses + " times. The results are as follows: ");
			System.out.print("Heads: " + heads);
			System.out.println(" Tails: " + tails);
			
			if ((guess.equalsIgnoreCase("heads") && heads > tails) || (guess.equalsIgnoreCase("tails") && tails > heads))
				System.out.println("You guessed correctly!");
			else if ((guess.equalsIgnoreCase("heads") && heads < tails) || (guess.equalsIgnoreCase("tails") && tails < heads))
				System.out.println("You guessed incorrectly...");
			else System.out.println("The coin flips tied");
			
			
			System.out.print("Wanna go another round? (y/n): ");
			keepGoing = scanner.next().charAt(0);
			heads = 0;
			tails = 0;} while (keepGoing == 'y');
			
		}

	}