import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// parallel arrays allow us to maintain an associated list of different types
		// should have the same length, and reference the same index locations

		String[] names = { "Alex", "Brandon", "Michelle" };
		int[] jerseyNums = { 22, 81, 1 };
		
		//want to print out name and associated jerseynum 
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name: "+ names[i] + " Jersey #"+ jerseyNums[i]);
		}
	////////////////////////////////////////////////////////////////////////////	
		// create an array
		int[] arr = { 6, 54, 3, 22, 1 };
		// sort method in assending numerical order
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //turning it back to a string
	////////////////////////////////////////////////////////////////////////	
		// replace entire array with 100, fill method
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr)); //turning it back to a string
		
		//fills index btwn range with 202 ,last index is exclusive(-1)
		Arrays.fill(arr, 1, 3, 202);
		System.out.println(Arrays.toString(arr)); //turning it back to a string
	////////////////////////////////////////////////////////////////////	
		int[]arr2 = {6, 54, 3, 22, 1};
		int[]arr3 = { 6, 54, 3, 22, 1 };
		System.out.println(Arrays.equals(arr2, arr3)); //will return true
		System.out.println(Arrays.equals(arr, arr2)); //will return false bc we made modifications 
		
	///////////////////////////////////////////////////////////////	
		int[] arr4 = {3,4,5,6};
		int[] arr5 = arr4 ; //DONT DO THIS, THIS IS BAD!!!
		
		//original 
		System.out.println("Array 4: "+ Arrays.toString(arr4));
		System.out.println("Array 5: "+ Arrays.toString(arr5));
		arr5[2] =160;
		//assuming only arr5 is changing but it affected our original array..
		System.out.println("Array 4: "+ Arrays.toString(arr4));
		System.out.println("Array 5: "+ Arrays.toString(arr5));
		
		System.out.println();
		//to overcome reference pointer copy issues , use methods
		//or change the length
		//original
		int [] arr6 = Arrays.copyOf(arr4, arr4.length);
		System.out.println("Array 4: "+ Arrays.toString(arr4));
		System.out.println("Array 6: "+ Arrays.toString(arr6));
		arr6[2]= 147;
		System.out.println("Array 4: "+ Arrays.toString(arr4));
		System.out.println("Array 6: "+ Arrays.toString(arr6));
		
	}

}
