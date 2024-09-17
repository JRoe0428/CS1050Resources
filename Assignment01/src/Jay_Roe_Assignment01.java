
import java.util.Scanner; // Needed for the Scanner Class

public class Jay_Roe_Assignment01 {
	
	public static void main(String[] args)
	{
		 String input;  // To hold line Input
		 char answer; // To hold a single Character
		 
		 // Create a Scanner object for keyword input.
		 Scanner keyboard = new Scanner(System.in);
		 
		 // Ask the user a Question.
		 System.out.print("Are you having fun yet? (Y=Yes, N=No)");
		 input = keyboard.nextLine();
		 answer = input.charAt(0); // Get the first Character
		 
		 if(answer =='N') {
			 System.out.println("Sorry to hear that you're not having fun. "
			 		+ "Let's read this story to see if it will get better.\n\n"
			 		+ "Once upon a time, in a land of technology, "
			 		+ "there was a computer acting up.\n"
			 		+ "It was producing random errors, freezing at the most "
			 		+ "inconvenient times, and generally causing chaos.\n\n"
			 		+ "The owner, frustrated, decided to consult a computer wizard"
			 		+ "renowned for fixing the most stubborn issues.\nThe wizard"
			 		+ "approached the computer, waved a magical mouse, and uttered "
			 		+ "the words: \"Ctrl + Alt + Del!\" \nTO everyone's surprise, "
			 		+ "the computer responded, \"Are you sure you want to delete all "
			 		+ "your problems and start a new life?\"\n\nThe owner burst "
			 		+ "into laughter, realizing that sometimes a little humor can be "
			 		+ "the best solution to tech troubles.\n And from that day on, "
			 		+ "they lived happily ever after, sharing a chuckle whenever "
			 		+ "the computer misbehaved.");
		 }
		 else {
			 System.out.println("AWESOME. There will be a lot more fun coming.");
		 }
		 
		 keyboard.close();
	}
	

}