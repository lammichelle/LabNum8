import java.util.Scanner;

public class LabNum8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Parallel arrays
		String [] names = {"Michelle", "Julia", "Camila"};
		int [] namesNum = {1,2,3};
		String [] hometowns = {"Hong Kong", "Detroit", "Brazil"};
		String [] favoriteFoods = {"Sushi","Salad", "Chocolate"};
		int userNum = 0;
		String userInput; 
		String knowMore = "yes"; //frist while loop
		String knowMore2 = "yes"; //second while loop
		
		//second while loop
		while(knowMore2.equalsIgnoreCase("yes")) { 
		//using validator class to validate the user prompt
		userNum = Validator.getInt(scan, "Welcome to our Java class. Which student would you like to learn more about? (1-3)", 1, 3);
		
		//first while loop
		while (knowMore.equalsIgnoreCase("yes")) {
			System.out.println("Student" + userNum + " is " + names[userNum-1] + ".");
			System.out.println("What would you like to know about " + names[userNum-1] + "?");
			userInput = Validator.getString(scan, "\"Hometown\" or \"Favorite food\"?");
			
			//use switch statements 
			switch (userInput) {
			case "Hometown":
				System.out.println(hometowns[userNum -1]);
				break;
				//do stuff 
			case "Favorite food":
				System.out.println(favoriteFoods[userNum -1]);
				break;
				//do stuff
			default:
				System.out.println("That data does not exist");
				break;
				//do something
			}
			//first while loop that continues to questions about the same student
			knowMore = Validator.getString(scan, "Would you like to know more?(yes/no)"); 
		}	
		//second while loop that jumps back to the top if yes
		knowMore2 = Validator.getString(scan, "Would you ilke to learn more about others?(yes/no)");
		} 
		System.out.println("Bye!");
				
	}
}
