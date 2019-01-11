/*
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 *
 */

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int element:A){
            if(set.contains(element))
                return element;
            set.add(element);
        }
        return -1;
    }
}
