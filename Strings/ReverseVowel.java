
/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 */

import java.util.*;

public class ReverseVowel {
	
	public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        Stack<Character> vowelsStack = new Stack<Character>();
        char[] array = s.toCharArray();
        for(Character c:array){
            if(vowels.contains(String.valueOf(c)))
                vowelsStack.push(c);
        }
        
        for(int i=0;i<array.length;i++){
            if(vowels.contains(String.valueOf(array[i]))){
                array[i] = vowelsStack.pop();
            }
        }
        return new String(array);
    }
	
	public static void main(String[] args) {
		ReverseVowel object = new ReverseVowel();
		
		//TestCase - Input
		String input = "palindrome";
		System.out.println("Input "+input);
		
		//TestCase - Output
		String output  = object.reverseVowels(input);
		System.out.println("Output "+output);
	}

}
