
/*
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, 
 * and B[j] is the size of the j-th bar of candy that Bob has.
 * 
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both 
 * have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of 
 * candy bars they have.)
 * 
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] 
 * is the size of the candy bar that Bob must exchange.
 * 
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 */

import java.util.*;
public class FairCandySwap {
	public int[] fairCandySwap(int[] A, int[] B) {
		//SumA -a +b = SumB +a -b
		//SumA - SumB/2 = a-b
        int sumA = 0, sumB = 0;
        for(int a:A) sumA+=a;
        for(int b:B) sumB+=b;
        
        //If the difference of sum is not even, we cannot swap
        if((sumA-sumB) % 2 != 0)
            return new int[]{-1,-1};
        
        //Compute target which is equal to a - b
        int target = (sumA-sumB)/2;
        
        //Add values to HashSet
        HashSet<Integer> setA = new HashSet<Integer>();
        for(int a:A) setA.add(a);
        
        //While iterating through b, we are looking for a number = (SumA - SumB)/2 +b = a
        for(int b:B){
            if(setA.contains(target+b))
                return new int[]{target+b,b};
        }
        
        //If no answer found, return -1,-1
        return new int[]{-1,-1};
    }
	
	public static void main(String[] args) {
		FairCandySwap object = new FairCandySwap();
		
		//TestCase
		int[] A= {1,1};
		int[] B = {2,2};
		int[] result = object.fairCandySwap(A, B);
		System.out.println(result[0]+ " "+result[1]);
	}

}
