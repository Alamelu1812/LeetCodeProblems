/*
 * Given an array of integers that is already sorted in ascending order, find two numbers such that 
 * they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * where index1 must be less than index2.
 * 
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * 
 */

public class TwoSumSorted {
	public int[] twoSum(int[] numbers, int target) {
		
		//Sorted array gives arise to two pointer approach
        int index1 = 0, index2 = numbers.length - 1;
        while(index1 < index2){
            if(numbers[index1] + numbers[index2] == target)
                return new int[]{index1+1,index2+1};
            else if(numbers[index1] + numbers[index2] < target)
                index1++;
            else
                index2--;  
        }
        return new int[]{-1,-1};
    }
	
	public static void main(String[] args) {
		TwoSumSorted object = new TwoSumSorted();
		
		//TestCase1
		int[] nums = {1,2,4,7,8,9};
		int[] result1 = object.twoSum(nums,3);
		System.out.println(result1[0]+" "+result1[1]);
		
		//TestCase2
		int[] result2 = object.twoSum(nums,4);
		System.out.println(result2[0]+" "+result2[1]);
		
		//TestCase3
		int[] result3 = object.twoSum(nums,11);
		System.out.println(result3[0]+" "+result3[1]);
	}

}
