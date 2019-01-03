/*
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of 
 * favorite restaurants represented by strings.
 * 
 * You need to help them find out their common interest with the least list index sum. If there is a choice 
 * tie between answers, output all of them with no order requirement. You could assume there always exists an 
 * answer.
 * 
 */

import java.util.*;

public class MinimumIndexSum {
	public String[] findRestaurant(String[] list1, String[] list2) {
        int minMatchingIndex = Integer.MAX_VALUE;
        
        //Map to maintain words and indices in list1
        HashMap<String,Integer> indexMap = new HashMap<String,Integer>(); 
        
        //Map to maintain index sum and list of words with that index sum
        HashMap<Integer,List<String>> matchMap = new HashMap<Integer,List<String>>();
        
        //Looking for matching words is made faster by using HashMap
        for(int i=0;i<list1.length;i++)
            indexMap.put(list1[i],i);
        
        for(int i=0;i<list2.length;i++){
            if(indexMap.containsKey(list2[i])){
            	
            	//If entry for that sum already exists
                if(matchMap.containsKey(i+indexMap.get(list2[i]))){
                    List<String> match =  matchMap.get(i+indexMap.get(list2[i]));
                    match.add(list2[i]);
                    matchMap.put(i+indexMap.get(list2[i]),match);
                }
                //If entry for that sum does not exists
                else{
                    List<String> match =  new ArrayList<String>();
                    match.add(list2[i]);
                    matchMap.put(i+indexMap.get(list2[i]),match);
                }
                
                //Alter the minMatchingIndex accordingly
                minMatchingIndex = Math.min(minMatchingIndex,i+indexMap.get(list2[i]));
            }
            
        }
        
        //Return all words with same minimum sum index
        List<String> result = matchMap.get(minMatchingIndex);
        return result.toArray(new String[result.size()]);
    }
	
	public static void main(String[] args) {
		MinimumIndexSum object = new MinimumIndexSum();
		
		//TestCase - Input
		String[] list1= {"Shogun", "Tapioca Express", "Burger King", "KFC"}, list2 = 
			{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		
		//TestCase - Output
		String[] result = object.findRestaurant(list1, list2);
		for(String r:result)
			System.out.println(r);
	}

}
