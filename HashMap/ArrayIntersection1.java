/*
 * Given two arrays, write a function to compute their intersection.
 * 
 */

import java.util.*; 
public class ArrayIntersection1 {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        //HashSet to hold distinct elements of nums1
        for(int num:nums1)
            set.add(num);
        
        //Find distinct elements of nums2 present in nums1
        for(int num:nums2){
            if(set.contains(num))
                result.add(num);
        } 
        
        //Convert list to array
        int[] res = new int[result.size()];
        int index = 0;
        for(int e:result)
            res[index++] = e;
        
        return res;
    }
	
	public static void main(String[] args) {
		ArrayIntersection1 object = new ArrayIntersection1();
		
		//TestCase
		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] output = object.intersection(nums1, nums2);
		for(int i=0;i<output.length;i++)
			System.out.println(output[i]);
	}
}
