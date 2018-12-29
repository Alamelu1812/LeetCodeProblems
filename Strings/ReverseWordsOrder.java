
/*
 * 
 * Given an input string, reverse the string word by word.
 * 
 */

public class ReverseWordsOrder {
	public String reverseWords(String s) {
		if(s==null || s.length()==0)
            return s;
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        String res = "";
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0  && words[i]!=" ") //Append only valid words
                result.append(words[i]+ " ");
        }
        if(result.length()>0)
            res = result.substring(0,result.length()-1); //Trim the last space
        return res;
    }
	
	public static void main(String[] args) {
		ReverseWordsOrder object = new ReverseWordsOrder();
		
		//TestCase1
		String input1 = "the sky is blue";
		String output1 =  object.reverseWords(input1);
		System.out.println(output1);
		
		//TestCase2
		String input2 = "";
		String output2 =  object.reverseWords(input2);
		System.out.println(output2);
		
		//TestCase3
		String input3 = "1 ";
		String output3 =  object.reverseWords(input3);
		System.out.println(output3);
	}

}
