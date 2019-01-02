/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others 
 * appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count 
 * as extra space.
 * 
 */

import java.util.*;
public class DisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		
		//Idea: Mark whether the number was seen or not using the number as index
        List<Integer> result = new ArrayList<Integer>();
        
        for(int num:nums){
            if(nums[Math.abs(num)-1]>0)
                nums[Math.abs(num)-1] = -1 * nums[Math.abs(num)-1];
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
    }
	public static void main(String[] args) {
		DisappearedNumbers object = new DisappearedNumbers();
		
		//TestCase
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> result = object.findDisappearedNumbers(nums);
		
		System.out.println("Missing Numbers");
		for(Integer res:result)
			System.out.println(res);
				
	}

}
