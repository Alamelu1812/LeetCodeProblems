/*
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, 
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 * 
 * Mapping for all 26 lower case letters are provided
 * 
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
 * For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). 
 * We'll call such a concatenation, the transformation of a word.
 * 
 * Return the number of different transformations among all words we have.
 */



import java.util.*;

public class MorseCodes {
	
	public int uniqueMorseRepresentations(String[] words) {
		//HashSet to store only unique encodings
        HashSet<String> result = new HashSet<String>();
        
        //Array to hold the mappings between character and Morse Code
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        //Construct Morse Code for each word
        for(String word:words){
            StringBuilder encoding = new StringBuilder();
            for(int i=0;i<word.length();i++)
                encoding.append(morseCodes[word.charAt(i)-'a']);
            
            result.add(encoding.toString()); //add encodings that are unique only
        }
        return result.size();
    }
	
	public static void main(String[] args) {
		MorseCodes object = new MorseCodes();
		
		//TestCase
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(object.uniqueMorseRepresentations(words));
	}

}
