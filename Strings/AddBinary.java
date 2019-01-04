
/*
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 */
public class AddBinary {
	public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int indexPointer1 = a.length() -1, indexPointer2 = b.length() - 1;
        int carry = 0;
        
        //Traverse both the strings from the end
        while(indexPointer1>=0 || indexPointer2>=0){
            int aInt = indexPointer1<0?0:a.charAt(indexPointer1)-'0';
            int bInt = indexPointer2<0?0:b.charAt(indexPointer2)-'0';
            
            int currSum = carry + aInt + bInt;
            sum.append(currSum%2);
            carry = currSum / 2;
            
            indexPointer1--;
            indexPointer2--;
        }
        
        //Reverse the sum to get the actual sum
        if(carry!=0)
            sum.append(carry);
        sum = sum.reverse();
        return sum.toString();
    }
	
	public static void main(String[] args) {
		AddBinary object = new AddBinary();
		
		//TestCase1
		System.out.println(object.addBinary("11", "11"));
		
		//TestCase2
		System.out.println(object.addBinary("100", "100"));
	}

}
