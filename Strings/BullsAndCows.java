/*
 * You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess 
 * what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess 
 * match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number 
 * but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive 
 * the secret number.
 *
 * Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to 
 * indicate the cows. 
 *
 * Please note that both secret number and friend's guess may contain duplicate digits.
 *
 */
 
class Solution {
    public String getHint(String secret, String guess) {
        int[] secretCounts = new int[10];
        int[] guessCounts = new int[10];
        int bulls = 0;
        int cows = 0;
        
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls += 1;
                continue;
            }
            secretCounts[secret.charAt(i) - '0']+=1;
            guessCounts[guess.charAt(i) - '0']+=1;
        }
        
        for(int i=0;i<secretCounts.length;i++){
            cows += Math.min(secretCounts[i],guessCounts[i]);
        }
        return ""+bulls+"A"+cows+"B";
    }
}
    
