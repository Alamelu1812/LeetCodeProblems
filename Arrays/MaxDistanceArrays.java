
import java.util.*;
public class MaxDistanceArrays {
	
	public int maxDistance(List<List<Integer>> arrays) {
		
		//Idea: Since lists are sorted, for the maximum distance calculation, we always take into account the 
		//absolute difference between last element of the current list - minimum value seen so far and
		//absolute difference between first element of the current list - maximum value seen so far
		
        int maxDistance = Integer.MIN_VALUE;
        int minSoFar = arrays.get(0).get(0);
        int maxSoFar = arrays.get(0).get(arrays.get(0).size()-1);
        
        for(int i=1;i<arrays.size();i++){
            maxDistance = Math.max(maxDistance,Math.max(Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - minSoFar),  Math.abs(maxSoFar -arrays.get(i).get(0))));
            minSoFar = Math.min(minSoFar,arrays.get(i).get(0));
            maxSoFar = Math.max(maxSoFar,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return maxDistance;
    }
	
	public static void main(String[] args) {
		MaxDistanceArrays object = new MaxDistanceArrays();
		
		
		//TestCase - Input
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(-1);
		list1.add(1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(-3);
		list2.add(1);
		list2.add(4);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(-2);
		list3.add(-1);
		list3.add(0);
		list3.add(2);
		
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(list1);		
		input.add(list2);		
		input.add(list3);	
		
		//TestCase - Output
		System.out.println(object.maxDistance(input));
	}

}
