
/*
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to 
 * make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding 
 * cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
 * 
 */

public class ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];
        for(int r=0;r<M.length;r++){
            for(int c=0;c<M[0].length;c++){
                result[r][c] = computeGrayScale(M,r,c);
            }
        }
        return result;
    }
    
    public int computeGrayScale(int[][] M, int r,int c){
        int numerator = 0;
        int denominator = 0;
        for(int i=r-1;i<=r+1;i++){
            for(int j=c-1;j<=c+1;j++){
                if(i>=0 && i<M.length && j>=0 && j<M[0].length){
                    numerator+=M[i][j];
                    denominator++;
                }
            }
        }
        return numerator/denominator;
    }
    
    public static void main(String[] args) {
    	ImageSmoother object = new ImageSmoother();
    	
    	//TestCase - Input
    	int[][] input = {{1,1,1,},{1,0,1},{1,1,1}};
    	System.out.println("Input");
    	for(int r=0;r<input.length;r++){
            for(int c=0;c<input[0].length;c++){
                System.out.print(input[r][c]+" ");
            }
            System.out.println();
        }
    	int[][] output = object.imageSmoother(input);
    	System.out.println();
    	
    	//TestCase - Output
    	System.out.println("Output");
    	for(int r=0;r<output.length;r++){
            for(int c=0;c<output[0].length;c++){
                System.out.print(output[r][c]+" ");
            }
            System.out.println();
        }
    }

}
