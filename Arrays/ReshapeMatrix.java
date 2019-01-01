
/*
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one 
 * with different size but keep its original data.
 * 
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing 
 * the row number and column number of the wanted reshaped matrix, respectively.
 * 
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same 
 * row-traversing order as they were.
 * 
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; 
 * Otherwise, output the original matrix.
 */

public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r*c)
            return nums;
        int numCount = 0;
        int[][] result = new int[r][c];
        
       //Row - overall count divided by column size
        //Column - overall count mod column size
        for(int rowIterator=0;rowIterator<nums.length;rowIterator++){
            for(int colIterator=0;colIterator<nums[0].length;colIterator++){
                result[numCount/c][numCount%c] = nums[rowIterator][colIterator];
                numCount++;
            }
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		ReshapeMatrix object = new ReshapeMatrix();
		
		//TestCase
		int[][] input = {{1,2},{3,4}};
		int row=1,col=4;
		int[][] output = object.matrixReshape(input, row, col);
		
		//Input
		System.out.println("Input");
		for(int r=0;r<input.length;r++) {
			for(int c=0;c<input[0].length;c++)
				System.out.print(input[r][c]+" ");
			System.out.println();
		}
				
		//Output
		System.out.println("Output");
		for(int r=0;r<output.length;r++) {
			for(int c=0;c<output[0].length;c++)
				System.out.print(output[r][c]+ " ");
			System.out.println();
		}
	}

}
