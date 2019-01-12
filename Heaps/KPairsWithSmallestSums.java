/*
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 * 
 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
 * 
 * Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.
 *
 */
 
class Solution {
    
    class heapComparator implements Comparator<int[]>{
        public int compare(int[] p1, int[] p2){
            return (p2[0]+p2[1]) - (p1[0]+p1[1]); 
        }
    }
    
    
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<int[]>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(new heapComparator());
        for(int i = 0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int[] pair = new int[2];
                pair[0] = nums1[i];
                pair[1] = nums2[j];
                
                if(maxHeap.size() < k)
                    maxHeap.add(pair);
                
                else if(maxHeap.peek()[0]+maxHeap.peek()[1] > (nums1[i]+nums2[j])){
                    maxHeap.poll();
                    maxHeap.add(pair);
                }
            }
        }
        
        while(!maxHeap.isEmpty()){
            result.add(maxHeap.poll());
        }
        
        Collections.reverse(result);
        return result;
    }
}
