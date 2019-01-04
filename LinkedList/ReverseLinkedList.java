class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = null;
        
        while(currNode!=null){
            //Save the state of nextNode
            nextNode = currNode.next;
            
            //Make the current node point to previous node
            currNode.next = prevNode;
            
            //Make prevNode as currNode
            prevNode = currNode;
            
            //Make currNode as nextNode
            currNode = nextNode;
        }
        return prevNode;
    }
}
