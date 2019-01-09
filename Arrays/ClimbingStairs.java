/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 */

class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int[] numberOfWays = new int[n+1];
        for(int i=0;i<=2;i++)
            numberOfWays[i] = i;
        return climbStairs(n,numberOfWays);
    }
    
    public int climbStairs(int n,int[] numberOfWays){
        if(numberOfWays[n] != 0)
            return numberOfWays[n];
        if(numberOfWays[n-1] == 0)
            climbStairs(n-1,numberOfWays);
        if(numberOfWays[n-2] == 0)
            climbStairs(n-2,numberOfWays);
        numberOfWays[n] = numberOfWays[n-1] + numberOfWays[n-2];
        return numberOfWays[n];
    }
}
