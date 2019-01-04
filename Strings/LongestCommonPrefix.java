/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        StringBuffer longestCommonPrefix =  new StringBuffer();
        if(strs == null || strs.length == 0)
            return longestCommonPrefix.toString();
        
        //Idea: for each character in the first word, check all the words for the corresponding character
        for(int i=0;i<strs[0].length();i++){
            char currentChar = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != currentChar)
                    return longestCommonPrefix.toString();
            }
            longestCommonPrefix.append(String.valueOf(strs[0].charAt(i)));
        }
        return longestCommonPrefix.toString();
    }
	
	public static void main(String[] args) {
		LongestCommonPrefix object = new LongestCommonPrefix();
		
		//TestCase
		String[] words = {"flower","flow","flight"};
		String longestCommonPrefix = object.longestCommonPrefix(words);
		System.out.println(longestCommonPrefix);
	}

}
