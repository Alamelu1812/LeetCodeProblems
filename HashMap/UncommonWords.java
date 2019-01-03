
/*
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists 
 * only of lowercase letters.)
 * 
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other 
 * sentence.
 * 
 * Return a list of all uncommon words. 
 * 
 * You may return the list in any order.
 * 
 */

import java.util.*;

public class UncommonWords {
	public String[] uncommonFromSentences(String A, String B) {
        List<String> result = new ArrayList<String>();
        HashMap<String,Integer> frequencyCountMap = new HashMap<String,Integer>();
        
        String[] wordsA = A.split(" ");
        String[] wordsB = B.split(" ");
        
        //One map holds list of words from both the sentences
        for(String word:wordsA)
            frequencyCountMap.put(word,frequencyCountMap.getOrDefault(word,0)+1);
        
        for(String word:wordsB)
            frequencyCountMap.put(word,frequencyCountMap.getOrDefault(word,0)+1);
        
        //If the word count from both sentences put together is 1, add it to the result
        for(String word:frequencyCountMap.keySet()){
            if(frequencyCountMap.get(word) == 1)
                result.add(word);
        }

        return result.toArray(new String[result.size()]);
    }
	
	public static void main(String[] args) {
		UncommonWords object = new UncommonWords();
		
		//TestCase
		String A = "this apple is sweet", B = "this apple is sour";
		
		String[] output = object.uncommonFromSentences(A, B);
		
		for(int i=0;i<output.length;i++)
			System.out.println(output[i]);
	}

}
