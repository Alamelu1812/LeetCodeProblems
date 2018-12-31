
/*
 * Given a matrix A, return the transpose of A.
 * 
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column 
 * indices of the matrix.
 * 
 */
public class TransposeMatrix {
	
	//Matrix transpose is not in-place
	//For a matrix transpose to be in-place, the matrix needs to be a square matrix
	
	public int[][] transpose(int[][] A) {
        int M = A.length;
        int N = A[0].length;
        
        int[][] result = new int[N][M];
        
        for(int r=0;r<A.length;r++){
            for(int c=0;c<A[0].length;c++)
                result[c][r] = A[r][c];
        }
        return result;
    }
	
	public static void main(String[] args) {
		TransposeMatrix object = new TransposeMatrix();
		
		//TestCase
		int[][] input = {{1,2,3},{4,5,6}};
		int[][] output = object.transpose(input);
		
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
