class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<Integer>();
        
        //Keep track of elements in the first half in the reverse order using stack
        //Slow pointer stops at the middle of the linked list
        while(slow!=null && fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Odd numbers in list
        if(fast!=null)
            slow = slow.next;
        
        //Checks whether the value at stack top is equal to value pointed by slow pointer
        while(slow!=null){
            if((Integer)stack.pop()!=slow.val)
                return false;
            slow = slow.next;
        }
        return true;
    }
}
