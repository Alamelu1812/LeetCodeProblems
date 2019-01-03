
/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of 
 * American keyboard.
 * 
 */

import java.util.*;

public class KeyBoardRow {
	public String[] findWords(String[] words) {
		
		//Variables to keep track of characters in a row
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        
        List<String> result = new ArrayList<String>();
        
        for(String word:words){
        	
        	//Variables to keep track of whether the word belongs to multiple rows or not
            boolean row1Flag = false;
            boolean row2Flag = false;
            boolean row3Flag = false;
            
            //Iterate character by character
            for(int i=0;i<word.length();i++){
            	//Set row flags accordingly
                if(row1.contains(word.substring(i,i+1)))
                    row1Flag = true;
                else if(row2.contains(word.substring(i,i+1)))
                    row2Flag = true;
                else if(row3.contains(word.substring(i,i+1)))
                    row3Flag = true;
            }
            
            //If all characters belong to one row, add it to the result
            if((row1Flag && !row2Flag && !row3Flag) || (!row1Flag && row2Flag && !row3Flag) || (!row1Flag && !row2Flag && row3Flag))
                result.add(word);
        }
        
        //Transform list to array
        String[] res = new String[result.size()];
        res = result.toArray(res);
        return res;
    }
	
	public static void main(String[] args) {
		KeyBoardRow object = new KeyBoardRow();
		
		//TestCase
		String[] input = {"Hello", "Alaska", "Dad", "Peace"};
		String[] output = object.findWords(input);
		for(int i=0;i<output.length;i++)
			System.out.println(output[i]);
	}

}
