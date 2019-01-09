/* 
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it 
 * would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return 0;
        
        if (nums[0] > target)
            return 0;
        
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == target)
                return mid;
            
            else if(mid+1 < nums.length && nums[mid] < target && nums[mid+1]>target)
                return mid + 1;
            
            else if(nums[mid] < target)
                lo = mid + 1;
            
            else
                hi = mid -1;
        }
        return nums.length;
    }
}
