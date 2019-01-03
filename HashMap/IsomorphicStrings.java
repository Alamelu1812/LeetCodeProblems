
import java.util.*;
public class IsomorphicStrings {
	
	public boolean isIsomorphic(String s, String t) {
		//Map to hold character to character mapping between two strings
        HashMap<Character,Character> charMap = new HashMap<Character,Character>();
        
        for(int i=0;i<s.length();i++){
            if(!charMap.containsKey(s.charAt(i))){
            	
                if(!charMap.containsValue(t.charAt(i)))
                    charMap.put(s.charAt(i),t.charAt(i));
                
                else
                	
                    return false;
            }
            
            else{
            	
                if(charMap.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		IsomorphicStrings object = new IsomorphicStrings();
		
		//TestCase
		String s = "egg", t = "add";
		System.out.println(object.isIsomorphic(s, t));
	}

}
