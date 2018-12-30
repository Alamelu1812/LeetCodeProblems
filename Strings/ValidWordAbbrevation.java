
/*
 * Given a non-empty string s and an abbreviation abbr, return whether the string matches with the 
 * given abbreviation.
 * 
 * A string such as "word" contains only the following valid abbreviations:
 * ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", 
 * "w3", "4"]
 * 
 * Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".
 * 
 * Note: Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
 * 
 */

public class ValidWordAbbrevation {
	public boolean validWordAbbreviation(String word, String abbr) {
        int wordPointer = 0;
        int abbrPointer = 0;
        
        while(abbrPointer < abbr.length() && wordPointer <word.length()) {
        	
        	//Check for same letters at both the pointers
        	if(Character.isLetter(abbr.charAt(abbrPointer))) {
        		if(word.charAt(wordPointer)!=abbr.charAt(abbrPointer))
        			return false;
        		wordPointer++;
        		abbrPointer++;
        	}
        	
        	else {
        		int value = 0;
        		if(abbr.charAt(abbrPointer)=='0')
        			return false;
        		
        		//Construct the value to be appended to index
        		while(abbrPointer<abbr.length() && Character.isDigit(abbr.charAt(abbrPointer))) {
        			value = value*10 + ((abbr.charAt(abbrPointer++) - '0'));
        		}
        		wordPointer += value;
        	}
        	
        	//If either one of the pointer exceeds the length of the respective string, break it
        	if(abbrPointer>=abbr.length() || wordPointer>=word.length())
        		break;
        	
        }
        
        //Return if both the the strings have been iterated completely
        return abbrPointer==abbr.length() && wordPointer ==word.length();
        
    }

	public static void main(String[] args) {
		ValidWordAbbrevation object = new ValidWordAbbrevation();
		
		//TestCase1
		String s = "internationalization", abbr = "i5a11o1";
		System.out.println(object.validWordAbbreviation(s, abbr));
		
		//TestCase2
		s = "apple";
		abbr = "a2e";
		System.out.println(object.validWordAbbreviation(s, abbr));
		
		//TestCase3
		s = "a";
		abbr = "01";
		System.out.println(object.validWordAbbreviation(s, abbr));
	}

}
