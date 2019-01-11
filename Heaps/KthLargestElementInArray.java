/*
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.
 * 
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial 
 * elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest 
 * element in the stream.
 *
 */
 
class KthLargest {
    int K;
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    public KthLargest(int k, int[] nums) {
        K = k;
        for(Integer n:nums)
            add(n);
    }
    
    public int add(int val) {
        if(minHeap.size() < K)
            minHeap.add(val);
        else if(minHeap.peek() < val){
            minHeap.poll();
            minHeap.add(val);
        }
        return minHeap.peek();
    }
}
