import java.util.Scanner;

public class Palinumber {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Please write a new number");
		int number = num.nextInt();
		int newNumber = 0;
		int mod;

		while (number != 0) {
			mod = number % 10;
			newNumber = newNumber * 10 + mod;
			number /= 10;
		}
		if (number == newNumber) {
			System.out.println("This is a palindrom Number");
		} else {
			System.out.println("This is not Palindrom Number");
		}

	}
}