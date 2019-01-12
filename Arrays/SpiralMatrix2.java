/*
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int r1 = 0, r2 = n-1, c1 = 0, c2 = n-1;
        int value = 1;
        while(r1<=r2 && c1<=c2){
            for(int c=c1;c<=c2;c++) {
                result[r1][c] = value;
                value++;
            }
            
            for(int r=r1+1;r<=r2;r++){
                result[r][c2] = value;
                value++;
            }
            
            for(int c=c2-1;c>=c1;c--){
                result[r2][c] = value;
                value++;
            }
            
            for(int r=r2-1;r>r1;r--){
                result[r][c1] = value;
                value++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
         }
        return result;
    }
}
