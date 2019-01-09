/*
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is 
 * formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded
 * by water.
 */

class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        //Idea: Mark Visited As 2
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == '1'){
                    numOfIslands++;
                    markVisitedIslands(grid,r,c);
                }
            }
        }
        return numOfIslands;
    }
    
    public void markVisitedIslands(char[][] grid,int r,int c){
        if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c] == '1'){
            grid[r][c] = '2';
            markVisitedIslands(grid,r+1,c);
            markVisitedIslands(grid,r-1,c);
            markVisitedIslands(grid,r,c+1);
            markVisitedIslands(grid,r,c-1);
        }
    }
}
