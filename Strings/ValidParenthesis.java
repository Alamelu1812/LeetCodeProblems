import java.util.*;
public class ValidParenthesis {
	public boolean isValid(String s) {
        if(s==null || s.length() == 0)
            return true;
        
        Stack<Character> charStack = new Stack<Character>();
        for(Character c:s.toCharArray()){
            
            
            if(c=='(' || c=='{' || c=='['){
                charStack.push(c);
            }
            else {
            	Character stackTop = charStack.empty()? '#':charStack.pop();
                if(c==')' && stackTop!='(')
                    return false;
                else if(c==']' && stackTop!='[')
                    return false;
                else if(c=='}' && stackTop!='{')
                    return false;
            }
        }
        return charStack.empty();
    }
	
	public static void main(String[] args) {
		ValidParenthesis object = new ValidParenthesis();
		
		//TestCase1
		String input1 ="{[]}";
		System.out.println(object.isValid(input1));
		
		//TestCase1
		String input2 ="{";
		System.out.println(object.isValid(input2));
				
		//TestCase1
		String input3 ="{[}]";
		System.out.println(object.isValid(input3));
	}

}
