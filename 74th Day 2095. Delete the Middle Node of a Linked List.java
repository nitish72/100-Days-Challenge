// Date : 30th Dec 2023
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head.next == null){
           return null;
       } 
       ListNode fast = head;
       ListNode slow = head;
       ListNode pre = slow;
       while(fast!=null && fast.next!=null){ 
            pre = slow; //Pre me hm slow ko intialize kr denge
           slow = slow.next; //Slow ko ek node move krenge
           fast = fast.next.next; //Fast ko 2 node move krenge 
       }
       pre.next = pre.next.next; //Yahan hm pre k next me hm next wale ko jod denge taki hme mid wale k agle wala adrress mil jaye
       return head;
    }
}
