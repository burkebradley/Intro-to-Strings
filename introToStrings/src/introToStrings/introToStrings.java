package introToStrings;
import java.util.Scanner;
public class introToStrings
	{
	static Scanner userInput = new Scanner (System.in);
			public static void main(String[] args)
			{
				insideVoice();
				System.out.println();
				verticalLetters();
			}
			
			public static void insideVoice()
			{
				System.out.println("Say something.");
				String userScream = userInput.nextLine();
				System.out.print(userScream.substring(0,1));
				System.out.println(userScream.toLowerCase().substring(1,userScream.length()));
			}
			
			
			public static void verticalLetters()
			{
				
				
				
				
			}
	}
