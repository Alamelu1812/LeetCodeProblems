/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iterator1 = l1;
        ListNode iterator2 = l2;
        
        //DummyHead to have an handle on the result
        ListNode dummyHead = new ListNode(-1);
        ListNode iterator3 = dummyHead;
        int carry = 0;
        
        while(iterator1!=null || iterator2!=null){
        
            //Two values are added along with carry
            int val1 = iterator1!=null? iterator1.val : 0;
            int val2 = iterator2!=null? iterator2.val : 0;
            int sum = val1 + val2 + carry;
            
            //Compute new carry
            carry = sum/10;
            
            //New node added to result
            iterator3.next = new ListNode(sum%10);
            
            //Change pointer to next node
            iterator3 = iterator3.next;
            
            if(iterator1!= null)
                iterator1 = iterator1.next;
                
            if(iterator2!= null)
                iterator2 = iterator2.next;
        }
        
        //If carry is greater than 0, create an extra node in the end
        if(carry > 0)
            iterator3.next = new ListNode(carry);
        
        return dummyHead.next;    
    }
}
