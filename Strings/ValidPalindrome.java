
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * 
 */
import java.util.*;
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		//Two pointer approach
		//One pointer at the start and one pointer at the end
        int start=0, end=s.length()-1;
        
        while(start<end) {
        	
        	//Move start pointer until you find a valid AlphaNumeric
        	while(start<s.length() && !Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start))) 
        			start++;
        	
        	//Move end pointer until you find a valid AlphaNumeric
        	while(end>=0 && !Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end)))
        			end--;
        	//Compare valid alphanumeric characters at start and end poistion
        	if(start<s.length() &&  end>=0 && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
        		return false;
        	
        	start++;
        	end--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		ValidPalindrome object = new ValidPalindrome();
		
		//TestCase1
		String input ="A man, a plan, a canal: Panama";
		boolean result = object.isPalindrome(input);
		System.out.println(input+" is a palindrome?"+result);
		
		//TestCase2
		input ="race a car";
		result = object.isPalindrome(input);
		System.out.println(input+" is a palindrome?"+result);
	}

}
