/*
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking 
 * about the node number and not the value in the nodes.
 *
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 *
 */

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode oddPointer = head;
        ListNode evenPointer = head.next;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        
        while(evenPointer!=null && evenPointer.next!=null){
            oddPointer.next = oddPointer.next.next;
            oddPointer = oddPointer.next;
            evenPointer.next = evenPointer.next.next;
            evenPointer = evenPointer.next;
        }
        
        oddPointer.next = evenHead;
        return oddHead;
    }
}
