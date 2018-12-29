
/*
 * Given an array of characters, compress it in-place.
 * 
 * The length after compression must always be smaller than or equal to the original array.
 * 
 * Every element of the array should be a character (not int) of length 1.
 * 
 * After you are done modifying the input array in-place, return the new length of the array.
 * 
 */

public class CompressCharArray {
	public int compress(char[] chars) {
        int countConsecutive = 0;
        int compressedLength = 0;
        for(int current = 0;current < chars.length;current++){
            countConsecutive++;
            
            if(current+1>=chars.length || chars[current]!=chars[current+1]){
                chars[compressedLength++] = chars[current];
                if(countConsecutive>1){
                    for(char c: (""+countConsecutive).toCharArray())
                        chars[compressedLength++] = c;
                }
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }
	
	public static void main(String[] args) {
		CompressCharArray object = new CompressCharArray();
		
		//TestCase - Input
		char[] input = {'a','a','b','b','c','c','c'};
		System.out.println("Input");
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]);
		
		int compressedLength = object.compress(input);
		
		System.out.println();
		System.out.println();
		
		//TestCase - Output
		System.out.println("Output");
		for(int i=0;i<compressedLength;i++)
			System.out.print(input[i]);
	}

}
