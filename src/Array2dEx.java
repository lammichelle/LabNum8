
public class Array2dEx {

	public static void main(String[] args) {
		// initialize a 2D array with 3 rows and 3 columns
		// can be int, boolean, string etc
		// first [] on RHS = row count(required), second [] on RHS = column count
		// (optional)
		int[][] arr = new int[3][3];

		int[][] arr2 = {{ 3, 3, 3, 4 },
						{ 6, 5, 5, 7 },
						{ 7, 8, 8, 9 },
						{ 4, 3, 2, 2 } };

		System.out.println(arr2[2][2]); // index of row 2 and column 2

		// first loop is for rows
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) { // looping thru columns
				System.out.println(i + "," + j + " " + arr2[i][j]);

			}
		}

			int sum = 0;
			// enhanced for loop aka for each
			for (int[] row : arr2) { // loops thru rows (they are arrays)
				for (int columns : row) { // loops thru columns
					sum += columns;
					//sum = rows + columns?

				}

			}
			System.out.println(sum);
		
/////////////////////////////////////////////////////////////////////////
			//jagged array examle
			int[][] arr3 = new int [3][];
			arr3 [0] = new int [35]; //giving me 35 columns for my arrays at index 0
			arr3 [1] = new int [2];
			arr3 [2] = new int [4];
			
			arr3[0][14] = 144;
			System.out.println(arr3[0][14]); //assigning value for specific row and column
			System.out.println(arr3[0][0]); //have not assigned any value yet
			
	}

}
