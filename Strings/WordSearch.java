/*
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or 
 * vertically neighboring. The same letter cell may not be used more than once.
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        
        boolean result = false;
        
        for(int r=0;r<board.length;r++){
        	
            for(int c=0;c<board[0].length;c++){
            	
                //Utility function called only when the first letter matches
                if(word.charAt(0) == board[r][c]) {
                	
                    result = exist(board,word,0, r,c);
                    if(result)
                    	return true;
                    
                }
            }
            
        }
        return result;
    }
    
    public boolean exist(char[][] board, String word, int index, int r, int c){
      
        //If the index is at the end of word, all other letters have matched 
    	  if(index == word.length())
    		  return true;
        
        //If the row and columns are out of range, return false
        if(r < 0 || r>=board.length || c<0 || c>=board[0].length)
        	return false;
        
        //If character don't match with the position return false
        if(word.charAt(index) != board[r][c])
        	return false;
        
        //Masking the character to avoid reusing the same character
        board[r][c] ^= 256;	
        
        //Invoke function for 4 adjacent cells for the next character
        boolean exists = exist(board, word, index+1, r-1, c) || exist(board, word, index+1, r+1, c) || exist(board, word, index+1, r, c-1) || exist(board, word, index+1, r, c+1);
        
        //Remove the mask
        board[r][c] ^= 256;
        
        return exists;
    }
}
