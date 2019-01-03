/*
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the 
 * number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will 
 * stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 
 * 1 are happy numbers.
 * 
 */

import java.util.*;

public class HappyNumbers {
	public boolean isHappy(int n) {
		
		//Idea: Revisiting a number implies that there is a cycle and hence not a happy number
        HashSet<Integer> set = new HashSet<Integer>();
        while(1!=0){
            if(set.contains(n))
                return false;
            else{
                set.add(n);
                int nextNumber = 0;
                while(n>0){
                    int lastDigit = n%10;
                    nextNumber += lastDigit * lastDigit;
                    n = n/10;
                }
                if(nextNumber == 1)
                    return true;
                n = nextNumber;
            }
        }
    }
	
	public static void main(String[] args) {
		HappyNumbers object = new HappyNumbers();
		
		//TestCase1
		System.out.println(object.isHappy(19));
		
		//TestCase2
		System.out.println(object.isHappy(19));
	}
}
