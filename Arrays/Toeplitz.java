
/*
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * 
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * 
 */
public class Toeplitz {
	public boolean isToeplitzMatrix(int[][] matrix) {
		
		//Logic: Each row is the same as the previous row, except for a shift in the left
        for(int row=0;row<matrix.length-1;row++){
            for(int col=0;col<matrix[0].length-1;col++)
                if(matrix[row][col]!=matrix[row+1][col+1])
                    return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Toeplitz object = new Toeplitz();
		
		//TestCase
		int[][] input = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		System.out.println("Is the matrix toeplitz?"+object.isToeplitzMatrix(input));
	}

}
