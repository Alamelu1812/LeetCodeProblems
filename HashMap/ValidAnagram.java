/*
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * 
 */

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        //Map to maintain counts of characters from both strings
        int[] frequencyCount = new int[26];
        
        
        for (int i = 0; i < s.length(); i++) {
            frequencyCount[s.charAt(i) - 'a']++;
            frequencyCount[t.charAt(i) - 'a']--;
        }
        
        //If all counts are not zero, return false
        for (int c : frequencyCount) {
            if (c != 0) {
                return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		ValidAnagram object = new ValidAnagram();
		
		//TestCase1
		String s = "anagram";
		String t = "nagaram";
		System.out.println(object.isAnagram(s, t));
		
		//TestCase2
		s = "rat";
		t = "car";
		System.out.println(object.isAnagram(s, t));
	}
}
