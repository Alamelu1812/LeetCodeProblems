
/*
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */
public class LowerCase {
	public String toLowerCase(String str) {
		
        char[] charArray = str.toCharArray();
        
        //Iterate character by character
        for(int i=0;i<charArray.length;i++){
        	
        	//If uppercase, change it to lower case
            if(charArray[i]>=65 && charArray[i]<=90)
			    charArray[i]+=32;
        }
        
        return new String(charArray);
    }
	
	public static void main(String[] args) {
		LowerCase object = new LowerCase();
		
		//TestCase
		String input = "aBCDe";
		System.out.println("Input is "+input);
		System.out.println("Input is "+object.toLowerCase(input));
	}

}
