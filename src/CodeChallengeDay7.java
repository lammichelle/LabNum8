import java.util.Arrays;

/*
 * Given an array of ints length 3, 
 * figure out which is larger, 
 * the first or last element in the array, 
 * and set all the other elements to be that value. 
 * Return the changed array.
 */
public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = {98,43,22};

	//boolean arr1 = false; 
	
	
		if(arr[0]> arr[arr.length -1 ]) {
			
			arr [1] = arr [0];
			arr [2] = arr [0];
	} //if arr1 is true
		
		else {
			arr [0] = arr [2];
			arr [1] = arr [2];
			
		}
		
		System.out.println(Arrays.toString(arr));

	// your method should start here, 
	// and should be returning an int[]
		
		//SOLUTION:
		
		public static void main(String[] args) {
			int[] arr = {98,43,22};
		
		int [] max = maxEnd3(arr);
		System.out.println(Arrays.toString(max));
		
		for(int i = 0; i < max.length; i++);
		System.out.println(max[i]);
		
		//enhanced loop
		System.out.println("Enhanced for loop ex: ");
		for(int n : max) {
			System.out.println(n);
		}
		
		
		public static int [] maxEnd3(int[] nums) {
			int temp = 0;
			if(num[0] > nums[nums.length -1]) {
			}
			else {
				temp = nums[nums.length-1];
			}
			
			num[1] = temp;
			num[2]= temp;
			return nums;
			}
		}
}
}