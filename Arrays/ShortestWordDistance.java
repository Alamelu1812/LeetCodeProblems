
/*
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words 
 * in the list.
 * 
 */

public class ShortestWordDistance {
	public int shortestDistance(String[] words, String word1, String word2) {
		
        int indexPosition1 = -1, indexPosition2 = -1;
        int shortestDistance = Integer.MAX_VALUE;
        
        for(int i=0;i<words.length;i++){
        	
        	//Use indexPosition1 for tracking word1
            if(words[i].equals(word1)){
                indexPosition1 = i;
                if(indexPosition2!=-1)
                    shortestDistance = Math.min(Math.abs(indexPosition2-indexPosition1),shortestDistance); //update shortestDistance
            }
            
            //Use indexPosition1 for tracking word2
            else if(words[i].equals(word2)){
                indexPosition2 = i;
                if(indexPosition1!=-1)
                    shortestDistance = Math.min(Math.abs(indexPosition2-indexPosition1),shortestDistance); //update shortestDistance
            }
            
        }
        return shortestDistance;
    }
	
	public static void main(String[] args) {
		ShortestWordDistance object = new ShortestWordDistance();
		
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		
		//TestCase1
		String word1 = "coding", word2 = "practice";
		int output = object.shortestDistance(words, word1, word2);
		System.out.println("Shortest distance between "+word1+" and "+word2+" is "+output);
		
		//TestCase2
		word1 = "makes";
		word2 = "coding";
		output = object.shortestDistance(words, word1, word2);
		System.out.println("Shortest distance between "+word1+" and "+word2+" is "+output);
	}

}
