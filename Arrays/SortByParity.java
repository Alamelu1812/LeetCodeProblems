/*
 * Given an array A of non-negative integers, return an array consisting of all 
 * the even elements of A, followed by all the odd elements of A.

 * You may return any answer array that satisfies this condition.
 */

import java.util.Arrays;

public class SortByParity {
	public int[] sortArrayByParity(int[] A) {
		Integer[] array = new Integer[A.length];
		for(int i=0;i<A.length;i++)
			array[i] = A[i];
		
        Arrays.sort(array, (element1,element2)-> Integer.compare(element1%2,element2%2));
        
        for(int i=0;i<A.length;i++)
			A[i] = array[i];
        
        return A;
    }
	
	public static void main(String[] args) {
		SortByParity object = new SortByParity();
		int[] nums = new int[10];
		
		//TestCase1 - Input
		for(int i=1;i<=10;i++)
			nums[i-1]=i;
		object.sortArrayByParity(nums);
			
		System.out.println("Output of TestCase1");
		//TestCase1 - Output
		for(int i=0;i<10;i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		
		int value = 10;
		//TestCase2 - Input
		for(int i=0;i<10;i++) {
			nums[i]=value;
			value--;
		}
		object.sortArrayByParity(nums);
		System.out.println();
		System.out.println("Output of TestCase2");				
		//TestCase2 - Output
		for(int i=0;i<10;i++)
			System.out.print(nums[i]+" ");
		
		//The even and odd numbers are grouped together. Each group is not sorted.
	}

}
