
/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * 
 */
public class LastWordLength {
	public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0)
            return 0;
        int lastWordLength = 0;
        int iterator = s.length()-1;
        
        //Exclude all white spaces after the last word
        while(iterator>=0 && s.charAt(iterator)==' ')
            iterator--;
        
        //Compute length until you find a space
        while(iterator>=0 && s.charAt(iterator)!=' '){
            iterator--;
            lastWordLength++;
        }
        
        return lastWordLength;
        
    }
	
	public static void main(String[] args) {
		LastWordLength object = new LastWordLength();
		
		//TestCase
		String input = "My world revolves around my kids";
		int lastWordLength = object.lengthOfLastWord(input);
		System.out.println("Last word length is "+lastWordLength);
	}

}
