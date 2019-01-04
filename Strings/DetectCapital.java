
/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * 
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * 
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * 
 * Otherwise, we define that this word doesn't use capitals in a right way.
 */

public class DetectCapital {
	
	public boolean detectCapitalUseVersion1(String word) {
        boolean lowerCase = false, upperCase = false;
        
        //If mixed case found between 1 till end of string, then it is not a valid capitalization
        //If the first character is lower and the rest is capitalized, it is not a valid capitalization
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                upperCase = true;
            else
                lowerCase = true;
        }
        if(upperCase && lowerCase)
            return false;
        else if(word.charAt(0)>='a' && upperCase)
            return false;
        return true;
    }
	
	public boolean detectCapitalUseVersion2(String word) {
        if(word == word.toUpperCase())
            return true;
        else if (word == word.toLowerCase())
            return true;
        else{
            if(word.charAt(0)>=65 && word.charAt(0)<=91){
                for(int i=1;i<word.length();i++)
                    if(word.charAt(i)>=65 && word.charAt(i)<=91)
                        return false;
                return true;
            }
            else
                return false;
        }
    }
	
	public static void main(String[] args) {
		DetectCapital object = new DetectCapital();
		
		System.out.println(object.detectCapitalUseVersion1("USA"));
		
		System.out.println(object.detectCapitalUseVersion1("Australia"));
	}

}
