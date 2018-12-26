
import java.util.*;

public class TopKFrequentElements {
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //Count the occurrence of each Integer
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        //Make a list of all distinct integers from the map's keys
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        
        //Sort list based on the number of times each integer occur
        Collections.sort(list, (i1,i2) -> map.get(i2) - map.get(i1));
        
        //Return only k frequent elements
        return list.subList(0,k);
    }
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,1,2,3,1,2};
		System.out.println(topKFrequent(nums,2));
		
	}

}
