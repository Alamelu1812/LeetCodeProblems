
/*
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */

public class MaxConsecutiveOnes {
	int maxConsecutiveOne = 0;
    int countConsecutiveOne = 0;
    public int findMaxConsecutiveOnes(int[] nums) {
        for(int i=0;i<nums.length;i++){
        	
        	//If nums[i] is 1, increment the consecutive count variable
            if(nums[i] == 1)
                countConsecutiveOne++;
            //If nums[i] is 0, it marks the end of consecutive ones. 
            //The current consecutive count is compared with prev max consecutive count 
            //Reset the veriable that tracks current consecutive count to 0
            else{
                maxConsecutiveOne = Math.max(maxConsecutiveOne,countConsecutiveOne);
                countConsecutiveOne = 0;
            }
        }
        return Math.max(maxConsecutiveOne,countConsecutiveOne);
    }
    
    public static void main(String[] args) {
    	MaxConsecutiveOnes object = new MaxConsecutiveOnes();
    	
    	//TestCase
    	int[] nums = {1,1,0,1,1,1};
    	System.out.println(object.findMaxConsecutiveOnes(nums));
    }

}
