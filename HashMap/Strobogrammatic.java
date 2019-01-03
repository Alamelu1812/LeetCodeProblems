/*
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * 
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * 
 */

import java.util.*;

public class Strobogrammatic {
	public boolean isStrobogrammatic(String num) {
		//Idea: Two pointer approach: The character at left index and the character mapping of the right index should match
		
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        
        int index1 = 0, index2 = num.length()-1;
        
        while(index1 <= index2){
            if(map.containsKey(num.charAt(index1)) && map.containsKey(num.charAt(index2))){
            	if(num.charAt(index1) != map.get(num.charAt(index2)))
            		return false;
            }
            else
                return false;
            index1++;
            index2--;
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		Strobogrammatic object = new Strobogrammatic();
		
		//TestCase1
		String num1 = "2";
		System.out.println(object.isStrobogrammatic(num1));
		
		//TestCase2
		String num2 = "96";
		System.out.println(object.isStrobogrammatic(num2));
	}

}
