
/*
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and 
 * uppercase letters only.

 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

 * The rules of Goat Latin are as follows:

 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
 * For example, the word 'apple' becomes 'applema'.
 
 * If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
 * Return the final sentence representing the conversion from S to Goat Latin. 
 */

public class GoatLatin {
	
	public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuilder result = new StringBuilder();
        String vowels ="aeiouAEIOU";
        
        for(int i=0;i<words.length;i++){
            StringBuilder newWord = new StringBuilder();
            
            //Handle vowel logic
            if(!vowels.contains(words[i].substring(0,1)))
                newWord = new StringBuilder(words[i].substring(1)+words[i].substring(0,1));
            else
                newWord = new StringBuilder(words[i]);
            
            //Adding ma to all words
            newWord = newWord.append("ma");
            
            //Appending a's based on index
            for(int iterator=-1;iterator<i;iterator++)
                newWord = newWord.append("a");
            
            //Appending word to result
            result.append(newWord);
            
            //Appending space except for last word
            if(i!=words.length-1)
                result.append(" ");
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		GoatLatin object = new GoatLatin();
		
		//TestCase
		String input = "I speak Goat Latin";
		String output = object.toGoatLatin(input);
		System.out.println(input);
		System.out.println(output);
	}

}
