
/*
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in 
 * A so that the result equals B.
 * 
 */
public class BuddyStrings {
	
	public boolean buddyStrings(String A, String B) {
		
		//If length is not equal return false
		if(A.length()!=B.length())
			return false;
		
		//If two strings are equal, swapping the same character at two indices will yield buddy strings
		if(A.equals(B)) {
			char[] freqArray = new char[26];
			for(Character c:A.toCharArray()) 
				freqArray[c-'a'] += 1;
			
			for(int i=0;i<26;i++) {
				if(freqArray[i]>1)
					return true;
			}
			return false;	
		}
		
		else {
			int indexPosition1 = -1, indexPosition2 = -1;
	        int iteratorA = 0, iteratorB = 0;
	        
	        //Find positions where the characters don't match
	        while(iteratorA<A.length() && iteratorB<B.length()) {
	        	if(A.charAt(iteratorA)!=B.charAt(iteratorB) && indexPosition1==-1 )
	        		indexPosition1 = iteratorA;
	        	else if(A.charAt(iteratorA)!=B.charAt(iteratorB) && indexPosition2==-1 )
	        		indexPosition2 = iteratorA;
	        	else if(A.charAt(iteratorA)!=B.charAt(iteratorB))
	        		return false;
	        iteratorA++;
	        iteratorB++;
	        }
	        
	        //If only one character differs, it cannot yield a buddy string
	        if(indexPosition1==-1 || indexPosition2==-1)
	        	return false;
	        
	        //If the characters in the mismatched positions match, then it is a buddy string
			return (A.charAt(indexPosition1) == B.charAt(indexPosition2) 
					&& A.charAt(indexPosition2) == B.charAt(indexPosition1));
		}
        
    }
	
	public static void main(String[] args) {
		BuddyStrings object = new BuddyStrings();
		
		//TestCase1
		String input1 = "ab", input2 = "ba";
		System.out.println("Are these buddy strings:"+input1+" "+input2+"?"+object.buddyStrings(input1, input2));
		
		//TestCase2
		input1 = "ab";
		input2 = "ab";
		System.out.println("Are these buddy strings:"+input1+" "+input2+"?"+object.buddyStrings(input1, input2));
		
		//TestCase3
		input1 = "aa";
		input2 = "aa";
		System.out.println("Are these buddy strings:"+input1+" "+input2+"?"+object.buddyStrings(input1, input2));
		
		//TestCase4
		input1 = "aaaaaaabc";
		input2 = "aaaaaaacb";
		System.out.println("Are these buddy strings:"+input1+" "+input2+"?"+object.buddyStrings(input1, input2));
	}

}
