
import java.util.*;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> currList = new ArrayList<String>();
		
		//BaseCase 
        if(n == 0){
        	String currSeq = "";
            currList.add(currSeq);
            return currList;
        }
        
        //Generate parentheses for previous number
        List<String> prevList = generateParenthesis(n-1);
        
        //Add all sequences generated by adding () after (
        Set<String> currSet = new HashSet<String>();
        for(String prevSeq:prevList){
            for(int i=0; i<prevSeq.length(); i++){
                if(prevSeq.charAt(i) == '('){
                    String currSeq = prevSeq.substring(0,i+1)+"()"+prevSeq.substring(i+1);
                    currSet.add(currSeq);
                }
            }
            
            //Create a new sequence by adding () to the front of existing sequence
            String firstParenSeq = "()"+prevSeq;
            currSet.add(firstParenSeq);
        }
        
        //transform set to list
        currList.addAll(currSet);
        return currList;
    }
	
	public static void main(String[] args) {
		GenerateParentheses object = new GenerateParentheses();
		
		//TestCase
		List<String> output = object.generateParenthesis(3);
		for(String o:output)
			System.out.println(o);
	}
}