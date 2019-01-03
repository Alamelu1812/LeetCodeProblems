/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * 
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
        int singleNumber = 0;
        
        //Each number appearing twice, will cancel out each other, leaving only the single number in the end
        for(int num:nums)
            singleNumber ^= num;
        
        return singleNumber;
    }

	public static void main(String[] args) {
		SingleNumber object = new SingleNumber();
		
		//TestCase
		int[] nums = {4,1,2,1,2};
		System.out.println("Single Number is "+object.singleNumber(nums));
	}
}
