/*
 * Given an array of 2n integers, your task is to group these integers into n pairs of 
 * integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all 
 * i from 1 to n as large as possible.
 */

public class ArrayPartition {
	public int arrayPairSum(int[] nums) {
        //Sort Array. We need minimum element at the expense of maximum. 
        java.util.Arrays.sort(nums);
        
        //Compute the sum of every alternate element
        int result = 0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }
	
	public static void main(String[] args) {
		ArrayPartition object = new ArrayPartition();
		
		//TestCase1
		int[] nums = {1,4,2,3};
		System.out.println(object.arrayPairSum(nums));
	}

}
