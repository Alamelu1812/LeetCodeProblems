/*
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters 
 * counting from the start of the string. If there are less than k characters left, reverse all of them. 
 * If there are less than 2k but greater than or equal to k characters, then reverse the first k characters 
 * and left the other as original.
 * 
 */


public class PartialReverse {
	
	public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        
        //Handle blocks of size 2*k
        for(int i=0;i<s.length();i+=2*k){
        	
        	//Reversing first k characters
            int start = i;
            int end = i+k-1>s.length()-1?s.length():i+k;
            StringBuilder reversedString = new StringBuilder(s.substring(start,end));
            reversedString = reversedString.reverse();
            
            //Appending original next k characters
            start = i+k>s.length()-1?s.length():i+k;
            end = i+2*k>s.length()-1?s.length():i+2*k;  
            reversedString.append(s.substring(start,end));
            
            //Attach 2k block to result string
            result.append(reversedString);
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
			PartialReverse object = new PartialReverse();
			
			//TestCase - Input
			String input = "abcdefg";
			System.out.println("Intput " + input);
			
			//TestCase - Output
			String output = object.reverseStr(input, 2);
			System.out.println("Output "+output);
		
	}

}
