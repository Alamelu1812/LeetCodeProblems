/*
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C 
 * in the string.
 */

class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] shortestDistance = new int[S.length()];
        Arrays.fill(shortestDistance,Integer.MAX_VALUE);
        int leftIndexOfC = Integer.MIN_VALUE/2;
        int rightIndexOfC = Integer.MAX_VALUE/2;
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == C)
                leftIndexOfC = i;
            shortestDistance[i] = i - leftIndexOfC;
        }
        
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) == C)
                rightIndexOfC = i;
            shortestDistance[i] = Math.min(shortestDistance[i],rightIndexOfC - i);
        }
        return shortestDistance;
    }
}
