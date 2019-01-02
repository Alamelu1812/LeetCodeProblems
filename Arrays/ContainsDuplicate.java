
/*
 * Given an array of integers, find if the array contains any duplicates.
 * 
 * Your function should return true if any value appears at least twice in the array, and it should 
 * return false if every element is distinct.
 * 
 */
import java.util.*;
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
	
	public static void main(String[] args) {
		ContainsDuplicate object = new ContainsDuplicate();
		
		//TestCase
		int[] nums = {7,1,5,3,6,4};
		boolean result = object.containsDuplicate(nums);
		System.out.println("Does the array contain duplicate?"+result);
	}


}
