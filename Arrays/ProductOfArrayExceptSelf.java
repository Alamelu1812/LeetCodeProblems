/*
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of 
 * all the elements of nums except nums[i].
 * 
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] forwardProduct = new int[nums.length];
        int[] backwardProduct = new int[nums.length];
        int[] productExceptItself = new int[nums.length];
        
        forwardProduct[0] = nums[0];
        backwardProduct[nums.length -1] = nums[nums.length -1];
        
        for(int i=1;i<nums.length;i++)
            forwardProduct[i] = forwardProduct[i-1] * nums[i];
        
        for(int i=nums.length -2;i>=0;i--)
            backwardProduct[i] = backwardProduct[i+1] * nums[i];
        
        for(int i=1;i<nums.length -1;i++)
            productExceptItself[i] = forwardProduct[i-1] * backwardProduct[i+1];
        
        productExceptItself[0] = backwardProduct[1];
        productExceptItself[nums.length -1] = forwardProduct[nums.length -2];
        return productExceptItself;  
    }
}
