import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //prompt user to get a number
		
		//arrays must be declared with a size (length)
		int [] arr = new int [4]; //assigning a value or empty array 
		//the values by default are 0 for indexes 0-3
		
		arr[0]= 55;
		
		System.out.println(Arrays.toString(arr));
		arr[2]= 77;
		System.out.println(arr[2]);
		
		//if want to see all the values then loop through
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		String name = "John";
		String [] arr2 = {"name", "Ben", "Cheo", "Camila"};
		System.out.println(arr2[0]); //this will print "john"
		
		//declaring and assign a size in 2 steps
		final int SIZE = 105; //size must be an int 
		double [] arr3;
		arr3 = new double [SIZE];
		
		//declaring , assigning size, and value in 1 step
		double [] arr4 = {4.5, 6.8, 9.9, 10.7};
		
		//let a user assign a size for array
		System.out.println("Hey! Please enter a number: ");
		int userNum = scan.nextInt();
		
		boolean [] arr5 = new boolean [userNum];
		System.out.println(arr5.length); //why length?
		
		//enhanced for loop aka for each
		//the disadvantage to using this is that we dont have access to the index
		for(boolean temp : arr5) {
			System.out.println(temp);
		}
		
		int [] nums = {6,7,23,44,8};
		System.out.println(sumArray(nums));

		int[]  testing = test(nums); //calling the last method 
		System.out.println(Arrays.toString(testing));
		
		//can make arrays of Objects like a robot
		//by default if no value is added, the value is null
		Robot[] robotArr = new Robot [2];
		robotArr[0]= new Robot("Grant Chirpus",5);
		
		for (Robot r : robotArr) {
			System.out.println(r); //print null? why?
		}
		
		scan.close();
		
	}
	
	// example of a method that takes in an array
	// and returns a single int value
	public static int sumArray(int[]arr) {
		int sum = 0;
		for(int temp : arr) {
			sum += temp;
			//sum = sum + temp;
						
		}
		return sum;
	}
	
	public static int [] test(int [] nums2) {
		int [] nums = {1,2,3};
		return nums; //return as array
	}

}
