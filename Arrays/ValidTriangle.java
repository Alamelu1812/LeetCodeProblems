/*
 * Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that 
 * can make triangles if we take them as side lengths of a triangle.
 *
 */

class Solution {
    public int triangleNumber(int[] nums) {
        int possibleTraingleCount = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int k = i + 2;
            for(int j=i+1;j<nums.length-1; j++){
                while(k<nums.length && nums[i]+nums[j] > nums[k])
                    k++;
                if(k - j - 1 > 0)
                    possibleTraingleCount += k - j - 1;
            }
        }
        return possibleTraingleCount;
    }
}
