/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, 
 * return -1.
 * 
 */
import java.util.*;
public class FirstUniqueCharacter {
	
	public int firstUniqChar(String s) {
        HashMap<Character,Integer> freqMap = new HashMap<Character,Integer>();
        
        //Build a map of character count
        for(Character c:s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }
        
        //Iterate through string in order and find the first unique character
        for(int i=0;i<s.length();i++){
            if(freqMap.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		FirstUniqueCharacter object = new FirstUniqueCharacter();
		
		//TestCase
		String input = "loveleetcode";
		int output = object.firstUniqChar(input);
		System.out.println("Input is "+input);
		System.out.println("The first unique character occurs at index "+output);
	}

}
