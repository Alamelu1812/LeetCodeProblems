
/*
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseEntireString {
	public String reverseString(String s) {
        if(s== null || s.length() == 0)
            return s;
        int i=0, j=s.length()-1;
        char[] charArray = s.toCharArray();
        
        //Swap characters at position i and position wordlength - i
        while(i<j){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            
            i++;
            j--;
        }
        return new String(charArray);
    }
	
	public static void main(String[] args) {
		ReverseEntireString object = new ReverseEntireString();
		
		//TestCase - Input
		String input = "A man, a plan, a canal: Panama";
		System.out.println("Input is "+input);
		
		//TestCase - Output
		String output = object.reverseString(input);
		System.out.println("Output is "+output);
	}

}
