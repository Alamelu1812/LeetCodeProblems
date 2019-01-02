
/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative 
 * order of the non-zero elements.
 * 
 */
public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
		
		//Two Pointers - One pointer that keeps track of non-zero element; One pointer that iterates through input
        int nonZeroPointer = 0, currPointer = 0;
        
        //Move non-zero elements to the left
        while(currPointer < nums.length){
            if(nums[currPointer]!=0)
                nums[nonZeroPointer++] = nums[currPointer];
            currPointer++;
        }
        
        //Fill remaining of the array with zeros
        while(nonZeroPointer < nums.length){
            nums[nonZeroPointer++] = 0;
        }
    }
	
	public static void main(String[] args) {
		MoveZeroes object = new MoveZeroes();
		
		//TestCase - Input
		int[] nums = {0,1,0,3,12};
		
		System.out.println("Input");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
		
		//TestCase - Output
		object.moveZeroes(nums);
		
		System.out.println();
		
		System.out.println("Output");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}

}
