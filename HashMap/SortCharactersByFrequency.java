/*
 * Given a string, sort it in decreasing order based on the frequency of characters.
 */


import java.util.*;
public class SortCharactersByFrequency {
	public String frequencySort(String s) {
        HashMap<Character,Integer> freqMap = new HashMap<Character,Integer>();
        for(Character c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        
        List<Character> charList = new ArrayList<Character>(freqMap.keySet());
        Collections.sort(charList, (c1,c2) -> freqMap.get(c2) - freqMap.get(c1));
        StringBuffer result = new StringBuffer();
        for(Character c:charList){
            int freqCount = freqMap.get(c);
            for(int i=0;i<freqCount;i++){
                result.append(c);
            }
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		SortCharactersByFrequency object = new SortCharactersByFrequency();
		
		//TestCase - Input
		String input = "tree";
		System.out.println("Input "+input);
		String output = object.frequencySort(input);
		
		//TestCase - Output
		System.out.println("Output "+output);
	}

}
