
public class SetMismatch {
	
	public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        
        //Mark elements already visited to be negative. If you find the element at the index to be negative, 
        //it is already visited and hence the duplicated number
        for(int num:nums){
            num = Math.abs(num);
            if(nums[num-1]<0)
                result[0] = num;
            else
                nums[num-1] = -1 * nums[num-1];
        }
        
        //If a number at an index is positive, then then the number pertaining to index was missing as all other
        //elements were marked as negative
        for(int n=0;n<nums.length;n++){
            if(nums[n] > 0)
                result[1] = n+1;
        }
        return result;
    }
	
	public static void main(String[] args) {
		SetMismatch object = new SetMismatch();
		
		//TestCase
		int[] nums = {1,2,3,3};
		int[] result = object.findErrorNums(nums);
		System.out.println(result[0]+" "+result[1]);
	}

}
