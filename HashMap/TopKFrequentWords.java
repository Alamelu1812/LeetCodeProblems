
import java.util.*;

public class TopKFrequentWords {
	
	public List<String> topKFrequent(String[] words, int k) {
		
		//Count the frequency of occurence
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        //Make a list of distinct words
        List<String> list = new ArrayList<String>(map.keySet());
        
        //Sort list based on occurrence
        Collections.sort(list, (w1,w2) -> (map.get(w1)).equals(map.get(w2))? w1.compareTo(w2) : map.get(w2) - map.get(w1) );
        
        //Return only a section of the list that is requested
        return list.subList(0,k);
    }
	
	public static void main(String[] args) {
		TopKFrequentWords object = new TopKFrequentWords();
		
		//TestCase - Input
		String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		List<String> result = object.topKFrequent(words, 3);
		
		//TestCase - Output
		for(String s:result) {
			System.out.println(s);
		}
	}

}
