
/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones 
 * you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you 
 * have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case 
 * sensitive, so "a" is considered a different type of stone from "A".
 * 
 */

import java.util.*;
public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        int result = 0;
        
        //Add jewels to the HashSet
        for(Character c:J.toCharArray())
            jewelSet.add(c);
        
        //If stone is a jewel increment the jewel count
        for(Character c:S.toCharArray()){
            if(jewelSet.contains(c))
                result += 1;
        }
        return result;
    }
	
	public static void main(String[] args) {
		JewelsAndStones object = new JewelsAndStones();
		
		//TestCase
		String J = "aA", S = "aAAbbbb";
		System.out.println(object.numJewelsInStones(J, S));
	}

}
