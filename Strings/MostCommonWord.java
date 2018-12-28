
/*
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list 
 * of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer 
 * is unique.
 * 
 * Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph 
 * are not case sensitive.  The answer is in lowercase.
 * 
 */

import java.util.*;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        int maxSeenSoFar = 0;
        String mostCommonWord = null;
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        Set bannedSet = new HashSet();
        for(String b:banned)
        	bannedSet.add(b);
        String[] words = paragraph.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String word:words) {
        	word = word.trim();
        	if(!bannedSet.contains(word)) {
        		int count = 0;
        		if(!map.containsKey(word)) 
        			count =1;
        		else 
        			count = map.get(word) +1 ;
        			
        		map.put(word,count);
        		if(maxSeenSoFar<count) {
    				maxSeenSoFar=count;
    				mostCommonWord = word;
    			}
        	}
        }
        return mostCommonWord;
    }
	
	public static void main(String[] args) {
		MostCommonWord object = new MostCommonWord();
		
		//TestCase
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println("Output");
		System.out.println(object.mostCommonWord(paragraph, banned));
	}

}
