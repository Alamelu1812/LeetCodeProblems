
/*
 * You are playing the following Flip Game with your friend: Given a string that contains only 
 * these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". 
 * The game ends when a person can no longer make a move and therefore the other person will be the winner.
 * 
 * Write a function to compute all possible states of the string after one valid move.
 * 
 */
import java.util.*;
public class FlipGame {
	
	public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        
        //For consecutive +s, create a temporary string after flipping the +s
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='+' && s.charAt(i+1)=='+'){
            	
            	//Option is the temporary variable
                String option ="";
                
                //Flip the current positions
                option = s.substring(0,i) + "--";
                
                //If there is remaining string left, append it
                if (i+2 < s.length())
                    option += s.substring(i+2);
                
                //Return result
                result.add(option);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		FlipGame object = new FlipGame();
		
		//TestCase
		String input = "++++";
		List<String> output = object.generatePossibleNextMoves(input);
		for(String o:output)
			System.out.println(o);
	}

}
