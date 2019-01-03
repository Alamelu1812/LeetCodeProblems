/*
 * Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the
 * order of the elements in A.
 * 
 * We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B 
 * at index j.
 * 
 * These lists A and B may contain duplicates. If there are multiple answers, output any of them.
 * 
 */
import java.util.*;

public class AnagramMapping {
	
	public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        
        int[] P = new int[A.length];
        
        //Map elements in B to their index
        for(int j=0;j<B.length;j++)
            indexMap.put(B[j],j);
        
        //Create a result where ith element in the result is the index location of ith element of A in B
        for(int i=0;i<A.length;i++)
            P[i] = indexMap.get(A[i]);
        
        return P;
    }
	
	public static void main(String[] args) {
		AnagramMapping object = new AnagramMapping();
		
		//TestCase - Input
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		int[] P = object.anagramMappings(A, B);
		
		//TestCase - Output
		System.out.println("Output");
		for(int i=0;i<P.length;i++)
			System.out.print(P[i]+" ");
	}

}
