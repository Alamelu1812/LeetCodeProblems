/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines ; 
 * otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 */
public class RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounts = new int[26];
        for(char c:magazine.toCharArray()){
            letterCounts[c-'a']++;
        }
        
        for(char c:ransomNote.toCharArray()){
            if(letterCounts[c-'a'] <= 0)
                return false;
            letterCounts[c-'a']--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		RansomNote object = new RansomNote();
		
		//TestCase1
		String ransomNote = "can";
		String magazine = "nicecup";
		System.out.println("TestCase1");
		System.out.println(object.canConstruct(ransomNote, magazine));
		System.out.println();
		
		//TestCase2
		ransomNote = "can";
		magazine = "nicecake";
		System.out.println("TestCase2");
		System.out.println(object.canConstruct(ransomNote, magazine));
	}

}
