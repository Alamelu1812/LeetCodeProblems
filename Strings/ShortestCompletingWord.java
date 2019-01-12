/*
 * Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate. Such a 
 * word is said to complete the given string licensePlate
 *
 * Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.
 *
 * It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.
 *
 * The license plate might have the same letter occurring multiple times. For example, given a licensePlate of "PP", the word 
 * "pair" does not complete the licensePlate, but the word "supper" does.
 *
 */

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String answer = "";
        int anwerLength = Integer.MAX_VALUE;
        
        licensePlate = licensePlate.toLowerCase();
        
        int[] lowerCaseCountsLicensePlate = new int[26];
        int[] lowerCaseCountsWord = new int[26];
        
        for(Character c:licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                lowerCaseCountsLicensePlate[c-'a']++;
            }
        }
        
        for(String word:words){
            Arrays.fill(lowerCaseCountsWord,0);
            if(word.length() >= anwerLength)
                continue;
            for(Character c:word.toCharArray())
                lowerCaseCountsWord[c-'a']++;
            
            
            if(checkCounts(lowerCaseCountsLicensePlate,lowerCaseCountsWord) && anwerLength > word.length()){
                anwerLength = word.length();
                answer = word;
            }
            
        }
        return answer;
    }
    
    public boolean checkCounts(int[] lowerCaseCountsLicensePlate, int[] lowerCaseCountsWord){
        for(int i=0;i<26;i++){
            if(lowerCaseCountsWord[i] < lowerCaseCountsLicensePlate[i])
                return false;
                
        }
        return true;
    }
}
