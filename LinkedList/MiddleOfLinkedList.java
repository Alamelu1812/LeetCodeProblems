class Solution {
    public ListNode middleNode(ListNode head) {
        //If there is no node in linked list or only one node, return the head of the linked list
        if(head==null || head.next==null)
            return head;
        
        //Two pointer approach: when fast pointer reaches the end of the list, the slow pointer is at the middle
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
