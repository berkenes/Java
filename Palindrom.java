import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write a word");
		String word = scanner.nextLine();
		String reverseWord = "";
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		if (reverseWord.equals(word)) {
			System.out.println("This is Palindrom");
		} else {
			System.out.println("This is not Palindrome");
		}

	}

}
