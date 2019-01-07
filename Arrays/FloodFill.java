/*
 * 
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 *
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor,
 * "flood fill" the image.
 *
 * To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of 
 * the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color 
 * as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.
 *
 * At the end, return the modified image.
 */


class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0 || image[sr][sc] == newColor)
            return image;
        
        floodFill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    
    public void floodFill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if(sr>=0 && sr<image.length && sc>=0 && sc<image[0].length 
          && image[sr][sc] == oldColor){
            image[sr][sc] = newColor;
            floodFill(image,sr+1,sc,oldColor,newColor);
            floodFill(image,sr-1,sc,oldColor,newColor);
            floodFill(image,sr,sc+1,oldColor,newColor);
            floodFill(image,sr,sc-1,oldColor,newColor);
        }
    }
}
