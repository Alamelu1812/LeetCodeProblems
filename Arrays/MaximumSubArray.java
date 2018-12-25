
/*
*Given an integer array nums, find the contiguous subarray (containing at least one number) 
*which has the largest sum and return its sum.
*/

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        //Kadane Algorithm
        //Maintain two variables: sumEnding Here and prevBestSum
    	if(nums == null || nums.length == 0)
    		return 0;
    	
        int sumEndingHere = 0;
        int prevBestSum = 0;
        
        for(int i=0;i<nums.length;i++){
            sumEndingHere = sumEndingHere + nums[i];
            
            if(sumEndingHere < 0)
                sumEndingHere = 0;
            
            if(sumEndingHere > prevBestSum)
                prevBestSum = sumEndingHere;
        }
        
        
        //Logic to handle an array of negative elements
        if(prevBestSum <= 0){
        	
            int negativeBest = nums[0];
            
            for(int i=1;i<nums.length;i++){
                negativeBest = Math.max(negativeBest,nums[i]);
            }
            
            prevBestSum = negativeBest;
        }
        return prevBestSum;
    }
    
    public static void main(String[] args) {
    	MaximumSubArray object = new MaximumSubArray();
    	
    	//TestCase1
    	int[] nums1 = {-1,-2,-3,-4,-1,-55};
    	System.out.println(object.maxSubArray(nums1));
    	
    	//TestCase2
    	int[] nums2 = {-1,4,-3,11,-1,-55};
    	System.out.println(object.maxSubArray(nums2));
    	
    	
    	//TestCase1
    	int[] nums3 = {1,6,7,-8,6,7,2};
    	System.out.println(object.maxSubArray(nums3));
    }

}
