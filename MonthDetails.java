import java.util.Scanner;
public class MonthDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] month = {"yo","January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] days = {29,31,28,31,30,31,30,31,31,30,31,30,31};
		int numberMonth;
		int year;
		char again;
		System.out.println("You can use this to find out how many days there are in any given month.\n");
		
		
		do {
			System.out.print("Enter a number between 1 and 12 for a month: ");
			numberMonth = scanner.nextInt();
			System.out.print("Please enter a year: ");
			year = scanner.nextInt();
			System.out.println();
			
			if (numberMonth > 12 || numberMonth < 1)
				System.out.println("There was an error...");
			else if ((year % 4 == 0) && (numberMonth == 2))
					System.out.println("There are " + days[0] + " days in " + month[numberMonth] + ", " + year);
			else
				System.out.println("There are " + days[numberMonth] + " days in " + month[numberMonth] + ", " + year);
			
			System.out.print("\nWanna go again? (y to continue): ");
			again = scanner.next().charAt(0);
			System.out.println();
		} while (again == 'y');
		
		System.out.println("\nThanks for participating, you stud!");
	}

}