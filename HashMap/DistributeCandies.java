
/*
 * Given an integer array with even length, where different numbers in this array represent different kinds of 
 * candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally 
 * in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 * 
 */

import java.util.*;

public class DistributeCandies {
	public int distributeCandies(int[] candies) {
		
		//Distinct candies sister could get, will be either the numberof candies she can get or number of distinct
		//varieties present in the collection
		
        Set<Integer> distinctCandies = new HashSet<Integer>();
        for(int candy:candies)
            distinctCandies.add(candy);
        
        return Math.min(candies.length/2,distinctCandies.size());
    }
	
	public static void main(String[] args) {
		DistributeCandies object = new DistributeCandies();
		
		//TestCase
		int[] candies = {1,1,2,2,3,3};
		System.out.println(object.distributeCandies(candies));		
	}
}
