/* 
 * Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the 
 * median is the mean of the two middle value.
 * 
 * For example,
 * [2,3,4], the median is 3
 * 
 * [2,3], the median is (2 + 3) / 2 = 2.5
 * 
 * Design a data structure that supports the following two operations:
 * 
 * void addNum(int num) - Add a integer number from the data stream to the data structure.
 * double findMedian() - Return the median of all elements so far.
 *
 */
 
class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    
    class MaxHeapComparator implements Comparator<Integer>{
        public int compare(Integer x,Integer y){
            return y - x;
        }  
    }
    
    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<Integer>(new MaxHeapComparator());
        minHeap = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if(minHeap.size() >maxHeap.size())
            maxHeap.add(minHeap.poll());
    }
    
    public double findMedian() {
        if(maxHeap.isEmpty())
            return 0;
        
        if(maxHeap.size() == minHeap.size())
            return ((double)maxHeap.peek() + (double)minHeap.peek())/2;
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
