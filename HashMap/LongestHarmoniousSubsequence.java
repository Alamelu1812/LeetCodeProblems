
/*
 * We define a harmonious array is an array where the difference between its maximum value and its 
 * minimum value is exactly 1.
 * 
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among
 * all its possible subsequences.
 * 
 */
import java.util.*;
public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
        HashMap<Integer,Integer> freqCount = new HashMap<Integer,Integer>();
        
        int longestSubsequenceLength = 0;
        
        //Populate map with frquency count
        for(int num:nums)
            freqCount.put(num,freqCount.getOrDefault(num,0)+1);
        
        //For each number, check the count of the number-1, number+1
        for(int num:nums){
            int numCount = freqCount.get(num);
            
            int prevNumCount = freqCount.containsKey(num-1)? freqCount.get(num-1):0;
            int nextNumCount = freqCount.containsKey(num+1)? freqCount.get(num+1):0;
            
            if(prevNumCount!= 0 || nextNumCount!=0)
                longestSubsequenceLength = Math.max(longestSubsequenceLength, Math.max(numCount+prevNumCount,numCount+nextNumCount));
        }
        
        return longestSubsequenceLength;
    }
	
	public static void main(String[] args) {
		LongestHarmoniousSubsequence object = new LongestHarmoniousSubsequence();
		
		//TestCase
		int[] input = {1,3,2,2,5,2,3,7};
		System.out.println("Length of longest harmonious subsequence is "+object.findLHS(input));
	}

}
