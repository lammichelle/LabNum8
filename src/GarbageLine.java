import java.util.Scanner;

public class GarbageLine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type something:");
		String next = scan.next();
		//scan.nextLine();//garbage line
		
		System.out.println(next);
		next = scan.nextLine();
		System.out.println(next);
		
	}

}
