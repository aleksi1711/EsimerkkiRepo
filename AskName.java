import java.util.Scanner;

public class AskName {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input;
		int ika;
		
		System.out.println("What is your name?");
		input = in.nextLine();
		
		System.out.println("How old are you?");
		ika = Integer.parseInt(in.nextLine());
		
		System.out.println("Your name is " + input + " and you are " + ika + " years old.");
	}

}
