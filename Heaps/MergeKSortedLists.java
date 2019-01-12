/*
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        
        ListNode dummyHead = new ListNode(-1);
        ListNode result = dummyHead;
        
        for(ListNode list:lists){
            ListNode n = list;
            while(n!=null){
                minHeap.add(n.val);
                n = n.next;
            }
        }
        
        while(!minHeap.isEmpty()){
            result.next = new ListNode(minHeap.poll());
            result = result.next;
        }
        
        return dummyHead.next;
    }
}
