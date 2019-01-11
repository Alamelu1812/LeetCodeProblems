class Solution {
     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    class heapComparator implements Comparator<Integer>{
        public int compare (Integer x, Integer y){
            return map.get(x) - map.get(y);
        }
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
       
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer> result  = new ArrayList<Integer>();
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new heapComparator());
        for(Integer l:map.keySet()){
            minHeap.add(l);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
        while(!minHeap.isEmpty())
            result.add(minHeap.poll());
        
        Collections.reverse(result);
        return result;
    }
}
