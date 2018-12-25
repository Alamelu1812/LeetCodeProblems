/*
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 */
public class FlippingImage {
	public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int j=0, k=A[i].length-1;
            while(j<=k){
                int temp = A[i][j];
                A[i][j] = A[i][k]^1;
                A[i][k] = temp ^ 1;
                j++;
                k--;
            }
        }
        return A;
    }
	
	public static void main(String[] args) {
		FlippingImage object = new FlippingImage();
		
		//TestCase - Input
		int[][] A = {{1,0,0},{1,1,1},{0,0,1}};
		System.out.println("Printing Input");
		System.out.println();
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++)
				System.out.print(A[r][c]+" ");
			System.out.println();
		}
		
		//TestCase - Output
		object.flipAndInvertImage(A);
		System.out.println("Printing Output");
		System.out.println();
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++)
				System.out.print(A[r][c]+" ");
			System.out.println();
		}
		
	}

}
