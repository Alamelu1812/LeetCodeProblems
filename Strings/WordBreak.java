
import java.util.*;
public class WordBreak {
	public boolean wordBreakNaive(String s, List<String> wordDict) {
        Set<String> set = new HashSet<String>(wordDict);
        set.add("");
        for(int i=0;i<s.length();i++){
            String before = s.substring(0, i+1);
            String after = s.substring(i+1);
            System.out.println(before+" "+after);
            
            if(!set.contains(before))
            	continue;
            if(set.contains(after))
            	return true;
            if(!wordBreakNaive(after,wordDict))
            	continue;
            return true;
        }
        return false;
    }
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> set = new HashSet<String>(wordDict);
		boolean[] dpArray = new boolean[s.length()+1];
		
		//Null Strung is always part of the word dictionary
		dpArray[0] = true;
		
		for(int substringLength = 1;substringLength<=s.length();substringLength++) {
			for(int splitAt = 0;splitAt<substringLength;splitAt++) {
				if(dpArray[splitAt] && wordDict.contains(s.substring(splitAt, substringLength))) {
					dpArray[substringLength] = true;
					break;
				}
			}
		}
		
		return dpArray[s.length()];
	}
	public static void main(String[] args) {
		WordBreak object = new WordBreak();
		List<String> wordDict = new ArrayList<String>();
		
		//TestCase
		wordDict.add("apple");
		wordDict.add("pen");
		System.out.println(object.wordBreak("applepenapple", wordDict));
	}

}
