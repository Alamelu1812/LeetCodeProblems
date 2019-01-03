/*
 * Given two arrays, write a function to compute their intersection.
 * 
 */

import java.util.*;
public class ArrayIntersection2 {
	public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //HashMap to hold counts of nums1
        for(int num:nums1)
            map.put(num,map.getOrDefault(num,0)+1);
        
        //Find elements of nums2 present in nums1
        for(int num:nums2){
            if(map.containsKey(num)){
                if(map.get(num)>0)
                    result.add(num);
                    map.put(num,map.get(num)-1);
            }
        } 
        
        //Convert list to array
        int[] res = new int[result.size()];
        int index = 0;
        for(int e:result)
            res[index++] = e;
        
        return res;
    }
	
	public static void main(String[] args) {
		ArrayIntersection2 object = new ArrayIntersection2();
		
		//TestCase
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] output = object.intersect(nums1, nums2);
		for(int i=0;i<output.length;i++)
			System.out.println(output[i]);
	}

}
