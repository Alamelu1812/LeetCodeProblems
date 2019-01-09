/* 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array. 
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergeIndex = m + n -1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        while(nums1Index >= 0 && nums2Index >=0){
            if(nums1[nums1Index] > nums2[nums2Index])
                nums1[mergeIndex--] = nums1[nums1Index--];
            else
                nums1[mergeIndex--] = nums2[nums2Index--];
        }
        
        while(nums2Index >= 0)
            nums1[mergeIndex--] = nums2[nums2Index--];
    }
}
