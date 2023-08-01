import java.util.Scanner;

public class Calculator {

	private static Scanner scanner;

	public static void main(String... args) {
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Pick from the following choices-"); 
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("0 for EXIT");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();

			if (choice >= 1 && choice <= 4) {
				System.out.println("Enter the first number:");
				double firstNumber = scanner.nextInt();
				System.out.println("Enter the second number:");
				double secondNumber = scanner.nextInt();
				double output = 0;

				switch (choice) {
				case 1:
					output = firstNumber + secondNumber;
                    break;

				case 2:
					output = firstNumber - secondNumber;
					break;

				case 3:
					output = firstNumber * secondNumber;
					break;

				case 4:
					output = firstNumber / secondNumber;
					break;

				}

				System.out.println("Your answer is..." + output);
			} else {
				if (choice == 0) {
					System.out.println("EXIT");
                    //Removed system.exit(0));
				} else {
					System.out.println("Invalid opoeration");
				}
			}
		}
	}
}