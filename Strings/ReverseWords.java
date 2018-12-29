/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still 
 * preserving whitespace and initial word order.
 * 
 */
public class ReverseWords {
	public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        
        //Reverse word by word
        for(int i=0;i<words.length-1;i++){
            StringBuilder w = new StringBuilder(words[i]);
            result.append(w.reverse()+ " ");
        }
        StringBuilder w= new StringBuilder(words[words.length-1]);
        result.append(w.reverse());
        
        return result.toString();
    }
	
	public static void main(String[] args) {
		ReverseWords object = new ReverseWords();
		
		//TestCase
		String input = "Let's take LeetCode contest";
		String output = object.reverseWords(input);
		System.out.println("Input is "+input);
		System.out.println("Output is "+output);
	}

}
