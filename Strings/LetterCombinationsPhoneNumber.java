
/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the 
 * number could represent.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to 
 * any letters.
 * 
 */

import java.util.*;

public class LetterCombinationsPhoneNumber {
	public List<String> letterCombinations(String digits) {
		
		//For empty digits, return empty list
		List<String> list = new ArrayList<String>();
        if(digits == null || digits.length() ==0)
            return list;
        
        //Mapping between digits and numbers
		HashMap<Character,String> map = new HashMap<Character,String>();
		map.put('2',"abc");
		map.put('3',"def");
		map.put('4',"ghi");
		map.put('5',"jkl");
		map.put('6',"mno");
		map.put('7',"pqrs");
		map.put('8',"tuv");
		map.put('9',"wxyz");
		
		//Invoke supporting function
		return letterCombinations(digits,0,map);
    }
	
	public List<String> letterCombinations(String digits,int index,HashMap<Character,String> map) {
		
		List<String> currList = new ArrayList<String>();
		
		//If end of digits is reached, return empty list
        if(index == digits.length()) {
        	currList.add("");
        	return currList;
        }
        
        //Create a list corresponding to the next number in the digit sequence
        List<String> nextList = letterCombinations(digits,index+1,map);
        
        //Get the alphabet string corresponding to the number
        String currString = map.get(digits.charAt(index));
        
        //Append alphabet to the list obtained from next digit
        for(Character c:currString.toCharArray()) {
        	for(String n:nextList)
        		currList.add(""+c+n);
        }
        
        //Return current list
        return currList;
    }
	
	public static void main(String[] args) {
		LetterCombinationsPhoneNumber object = new LetterCombinationsPhoneNumber();
		
		//TestCase1
		String digits1 = "234";
		System.out.println(digits1);
		List<String> output1 = object.letterCombinations(digits1);
		for(String s:output1)
			System.out.print(s+" ");
		
		System.out.println();
		
		//TestCase2
		String digits2 = "89";
		System.out.println(digits2);
		List<String> output2 = object.letterCombinations(digits2);
		for(String s:output2)
			System.out.print(s+" ");
	}

}
