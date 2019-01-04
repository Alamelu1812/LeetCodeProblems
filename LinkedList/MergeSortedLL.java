class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode result = dummyHead;
        
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                result.next = head1;
                head1 = head1.next;
                result = result.next;
            }
            else{
                result.next = head2;
                head2 = head2.next;
                result = result.next;
            }
        }
        
        while(head1!=null){
            result.next = head1;
            head1 = head1.next;
            result = result.next;
        }
        
        while(head2!=null){
            result.next = head2;
            head2 = head2.next;
            result = result.next;
        }
        return dummyHead.next;
    }
}
