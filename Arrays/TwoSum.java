/*
*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*
*You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

import java.util.*;

public class TwoSum {
	
	public int[] computeTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        //Basic checks
        if(nums == null || nums.length == 0){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        
        //Building the map counts
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        //Looping through map and finding complements
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                result[0] = i;
                result[1] = map.get(complement);
                return result;
            }
        }
        
        result[0] =-1;
        result[1] =-1;
        return result;  
    }
	
	public static void main(String[] args) {
		TwoSum object = new TwoSum();
		int[] nums = {1,2,4,7,8,9};
		
		//TestCase1
		int[] result1 = object.computeTwoSum(nums,3);
		System.out.println(result1[0]+" "+result1[1]);
		
		//TestCase2
		int[] result2 = object.computeTwoSum(nums,4);
		System.out.println(result2[0]+" "+result2[1]);
		
		//TestCase3
		int[] result3 = object.computeTwoSum(nums,11);
		System.out.println(result3[0]+" "+result3[1]);
	}

}

